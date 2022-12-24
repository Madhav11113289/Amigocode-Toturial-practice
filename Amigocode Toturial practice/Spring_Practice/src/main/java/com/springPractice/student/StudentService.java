package com.springPractice.student;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // student Student = new student();

    public List<student> getStudent(){
        return studentRepository.findAll();
    }


    public void addNewStudent(student Student) {
       Optional<student> studentByEmail= this.studentRepository.findStudentByEmail(Student.getEmail());

       if(studentByEmail.isPresent()){
        throw new IllegalStateException("email taken", null);
       }
       studentRepository.save(Student);
    }


    public void deleteStudent(Long id) {
        boolean exists=studentRepository.existsById(id);
        if(!exists){
            // throw new IllegalStateException(null, null)
            throw new IllegalStateException("student with id "+id+" does not exists");
        }
        studentRepository.deleteById(id);
    }

    @Transactional
    public void updateStudent(Long id, String name, String email) {
        student Student= studentRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                        "student with id "+ id+ " does not exists"));
        if(name!=null && 
            name.length()>0 &&
            !Objects.equals(Student.getName(), name)){
                    Student.setName(name);
                    System.out.println(Student.getName());
            }
            if(email!=null && 
            email.length()>0 &&
            !Objects.equals(Student.getEmail(), email)){
            Optional<student> studentOptional= studentRepository.findStudentByEmail(email);
            if(studentOptional.isPresent() ){
                throw new IllegalStateException("email taken");
            }    
                Student.setEmail(email);
            
            }
    }    
}
