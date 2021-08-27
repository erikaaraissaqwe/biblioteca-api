package com.biblioteca.repository;

import com.biblioteca.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository{

    public List<Person> listPerson = new ArrayList<>();

    @Override
    public Person save(Person p) {
        if (p != null ){
            listPerson.add(p);
            return p;
        }
        return null;
    }

    @Override
    public boolean delete(String p) {
        if (p != null ){
            Person person = this.findOne(p);
            listPerson.remove(person);
            return true;
        }
        return false;
    }

    @Override
    public List<Person> findAll() {
        return listPerson;
    }

    @Override
    public Person findOne(String p) {
        if (p != null ){
            return listPerson.stream().filter(person -> person.getCpf().equals(p)).findFirst().orElse(null);
        }
        return null;
    }

    @Override
    public Person update(Person p) {
        if(p != null){
            int index = listPerson.indexOf(p);
            listPerson.remove(index);
            listPerson.add(index, p);
            return p;
        }
        return null;
    }
}
