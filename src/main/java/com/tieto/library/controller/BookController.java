package com.tieto.library.controller;

import com.tieto.library.model.Book;
import com.tieto.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping
    public String getTestData() {
        Book book= new Book();
        book.setDescription("bla");
        book.setTitle("OMG");
        repository.save(book);
        return repository.findAll().toString();
    }
}
