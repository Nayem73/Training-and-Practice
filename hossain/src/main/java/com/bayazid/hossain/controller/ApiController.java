package com.bayazid.hossain.controller;

import com.bayazid.hossain.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        return person;
    }
}
