package com.springPractice.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class personService {

    public static List<person> getPerson() {

        return List.of(
                new person(
                        2L,
                        "samiksha",
                        "samiksha@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 22),
                        20));
    }
}
