package com.javaonthecloud.controller;

import com.javaonthecloud.model.Book;
import com.javaonthecloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by thales on 22/07/17.
 */
@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public Collection<Book> fetchAll() {
        return this.bookService.fetchAll();
    }
}
