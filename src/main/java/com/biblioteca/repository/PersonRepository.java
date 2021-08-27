package com.biblioteca.repository;

import com.biblioteca.models.Person;

import java.util.List;

public interface PersonRepository {

    Person save(Person p);

    boolean delete(String p);

    List<Person> findAll();

    Person findOne(String p);

    Person update(Person p);
}
