package com.biblioteca.controllers;

import com.biblioteca.models.Book;
import com.biblioteca.repository.BookRepositoryImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/books")
public class BookController {

    private BookRepositoryImpl repository = new BookRepositoryImpl();

    @GetMapping("/listAll")
    public List<Book> listAll(){
        return repository.findAll();
    }

    @GetMapping("/listOne{isbn}")
    public Book listOne(@PathVariable(value="isbn") String isbn){
        return repository.findOne(isbn);
    }

    @PostMapping("/insert")
    public Book createAndSave(@RequestBody Book book){
        return repository.save(book);
    }

    @PutMapping("/update")
    public Book update(@RequestBody Book book){
        return repository.update(book);
    }

    @DeleteMapping("/delete{isbn}")
    public Boolean delete(@PathVariable(value="isbn") String isbn){
        return repository.delete(isbn);
    }
}
