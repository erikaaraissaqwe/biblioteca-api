package com.biblioteca.controllers;

import com.biblioteca.models.Person;
import com.biblioteca.repository.PersonRepositoryImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/people")
public class PersonController {

    private PersonRepositoryImpl repository = new PersonRepositoryImpl();

    @GetMapping("/listAll")
    public List<Person> listAll(){
        return repository.findAll();
    }

    @GetMapping("/listOne{cpf}")
    public Person listOne(@PathVariable(value="cpf") String cpf){
        return repository.findOne(cpf);
    }

    @PostMapping("/insert")
    public Person createAndSave(@RequestBody Person person){
        return repository.save(person);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person){
        return repository.update(person);
    }

    @DeleteMapping("/delete{cpf}")
    public Boolean delete(@PathVariable(value="cpf") String isbn){
        return repository.delete(isbn);
    }
}
