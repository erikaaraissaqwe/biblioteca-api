package com.biblioteca.repository;

import com.biblioteca.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository{

    public List<Book> listBook = new ArrayList<>();


    @Override
    public Book save(Book b) {
        if (b != null ){
            listBook.add(b);
            return b;
        }
        return null;
    }

    @Override
    public boolean delete(String b) {
        if (b != null ){
            Book book = this.findOne(b);
            listBook.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> findAll() {
        return listBook;
    }

    @Override
    public Book findOne(String b) {
        if (b != null ){
            return listBook.stream().filter(book -> book.getIsbn().equals(b)).findFirst().orElse(null);
        }
        return null;
    }

    @Override
    public Book update(Book b) {
        if(b != null){
            int index = listBook.indexOf(b);
            listBook.remove(index);
            listBook.add(index, b);
            return b;
        }
        return null;
    }
}
