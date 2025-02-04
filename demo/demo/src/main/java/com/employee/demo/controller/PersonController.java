package com.employee.demo.controller;

import com.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.entity.Person
@RestController
public class PersonController {
  //Constructor Based Injection No need of using @Autowired
  private final PersonService personService;
  public PersonController(PersonService personService){
  this.personService=personService;
}

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAllPersons() {
        return ResponseEntity.ok(personService.getAllPerson());
    }
}