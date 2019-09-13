package com.example.demo.model;

import java.util.UUID;

public class Person {
    private final UUID Id;
    private final String Name;

    public Person(UUID id, String name) {
        Id = id;
        Name = name;
    }

    public UUID getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }
}
