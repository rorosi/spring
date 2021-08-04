package com.sparta.week01.controller;

import com.sparta.week01.prac.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
        @GetMapping("/myinfo")
        public Person getPerson() {
            Person person = new Person();
            person.setName("kim");
            person.setAge(35);
            person.setAddress("bucheon");
            person.setJob("wow");
            return person;
    }
}
