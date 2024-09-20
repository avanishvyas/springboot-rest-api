package com.intuit.craftdemo.Models;

import lombok.Data;

@Data
public class Person {

    public Person() {}

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    private String id;
    private String name;
    private String email;
}

