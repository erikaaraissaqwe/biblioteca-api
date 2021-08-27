package com.biblioteca.repository;


import com.biblioteca.models.Book;

import java.util.List;

public interface BookRepository {

    Book save(Book b);

    boolean delete(String b);

    List<Book> findAll();

    Book findOne(String b);

    Book update(Book b);
}
