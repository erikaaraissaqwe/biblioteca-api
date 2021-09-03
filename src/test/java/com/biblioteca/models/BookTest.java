package com.biblioteca.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BookTest {
    ArrayList<String> authors = new ArrayList<>(Arrays.asList("Julia Quinn", "Sarah J. Mass"));


    Book principal = new Book("78545P", "Flores ao Alvorecer","Romance", authors, 326L);

    @Test
    public void testCreateNewBook(){
        Book b = new Book("78545P", "Flores ao Alvorecer","Romance", authors, 326L);
        Assertions.assertEquals(b,
                principal);
    }

    @Test
    public void testGetIsbn() {
        Assertions.assertEquals("78545P", principal.getIsbn());
    }

    @Test
    public void testSetIsbn() {
        principal.setIsbn("78545PQ");
        Assertions.assertEquals("78545PQ", principal.getIsbn());
    }
    @Test
    public void testGetTitle() {
        Assertions.assertEquals("Flores ao Alvorecer", principal.getTitle());
    }

    @Test
    public void testSetTitle() {
        principal.setTitle("Flores ao Amanhecer");
        Assertions.assertEquals("Flores ao Amanhecer",principal.getTitle());
    }

    @Test
    public void testGetGenre() {
        Assertions.assertEquals("Romance", principal.getGenre());
    }

    @Test
    public void testSetGenre() {
        principal.setGenre("Romance para iludidos");
        Assertions.assertEquals("Romance para iludidos",principal.getGenre());
    }

    @Test
    public void testGetAuthors() {
        Assertions.assertEquals(authors, principal.getAuthors());
    }

    @Test
    public void testSetAuthors() {
        ArrayList<String> authors2 = new ArrayList<>(Arrays.asList("Meg Cabot", "Kiera Cass", "Lissa K"));
        principal.setAuthors(authors2);
        Assertions.assertArrayEquals(new ArrayList[]{authors2},new ArrayList[]{(ArrayList) principal.getAuthors()});
    }

    @Test
    public void testGetNumberOfPages() {
        Assertions.assertEquals(326L, principal.getNumberOfPages());
    }

    @Test
    public void testSetNumberOfPages() {
        principal.setNumberOfPages(963L);
        Assertions.assertEquals(963L,principal.getNumberOfPages());
    }

}
