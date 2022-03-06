package ru.netology.homeworkjdata61.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.homeworkjdata61.entity.Persons;
import ru.netology.homeworkjdata61.service.MyService;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam(value = "city") String city) {
        return myService.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Persons> getPersonsByAge(@RequestParam(value = "age") Integer age) {
        return myService.getPersonsByAge(age);
    }

    @GetMapping("/persons/by-name-surname")
    public Optional<Persons> getPersonsByNameSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return myService.getPersonsByNameSurname(name, surname);
    }
}
