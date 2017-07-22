package com.javaonthecloud.service;

import com.javaonthecloud.model.Book;
import com.javaonthecloud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by thales on 22/07/17.
 */
@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Collection<Book> fetchAll() {
        return this.bookRepository.findAll();
    }
}
