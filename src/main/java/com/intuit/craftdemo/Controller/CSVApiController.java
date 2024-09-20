package com.intuit.craftdemo.Controller;

import com.intuit.craftdemo.Models.Person;
import com.intuit.craftdemo.Service.CSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class CSVApiController {

    @Autowired
    private CSVService csvService;

    // API to get all people
    @GetMapping
    public List<Person> getAllPeople() {
        return csvService.getAllPeople();
    }

    // API to get person by ID
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable String id) {
        return csvService.getPersonById(id);
    }
}

