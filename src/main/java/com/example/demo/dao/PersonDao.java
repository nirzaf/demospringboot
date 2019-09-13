package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {
    int InsertPerson(UUID Id, Person person);

    default int InsertPerson(Person person){
        UUID Id = UUID.randomUUID();
        return InsertPerson(Id, person);
    }
}
