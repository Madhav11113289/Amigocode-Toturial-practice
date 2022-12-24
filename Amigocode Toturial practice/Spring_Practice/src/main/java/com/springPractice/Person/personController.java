package com.springPractice.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/person")
public class personController {
    
    private final personService personService;
    @Autowired
    public personController(personService personService) {
        this.personService = personService;
    }
    @GetMapping 
    public List<person> getPerson(){
            return personService.getPerson();
    }

    
}
