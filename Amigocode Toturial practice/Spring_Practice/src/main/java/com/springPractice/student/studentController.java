package com.springPractice.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentController {

    private final StudentService studentService;
    @Autowired
    public studentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<student> getStudent(){
       return studentService.getStudent();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody student Student){
        this.studentService.addNewStudent(Student);
    }
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.deleteStudent(id);
    }
    @PutMapping(path="{id}")
    public void updateStudent( 
                            @PathVariable("id") Long Id,
                            @RequestParam(required = false) String name,
                            @RequestParam(required = false) String email) {
                studentService.updateStudent(Id,name,email);        
    }
}
