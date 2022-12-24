package com.springPractice.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            student Marina = new student(
                    "Marina",
                    "marina@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 23)
                    );

            student Mark = new student(
                    "mark",
                    "mark@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 25)
                    );

            repository.saveAll(
                    List.of(Marina , Mark));
        };
    }
}
