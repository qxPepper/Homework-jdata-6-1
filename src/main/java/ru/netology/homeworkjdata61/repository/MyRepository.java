package ru.netology.homeworkjdata61.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.homeworkjdata61.entity.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public class MyRepository {
    @Autowired
    private PersonRepository personRepository;

    public PersonRepository getPersonRepository() {
        return personRepository;
    }

    @Transactional
    public List<Persons> getPersonsByCity(String city) {
        return personRepository.findMyCity(city);
    }

    @Transactional
    public List<Persons> getPersonsByAge(Integer age) {
        return personRepository.findMyAge(age);
    }

    @Transactional
    public Optional<Persons> getPersonsByNameSurname(String name, String surname) {
        return personRepository.findMyNameSurname(name, surname);
    }
}
