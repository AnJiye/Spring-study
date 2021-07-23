package com.sparta.week01_homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("지예");
        person.setAge(22);
        person.setAddress("어디살고있을까요?'0'하하하하");
        person.setJob("대학생");

        return person;
    }
}
