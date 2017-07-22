package com.javaonthecloud.service;

import com.javaonthecloud.model.Author;
import com.javaonthecloud.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thales on 22/07/17.
 */
@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public List<Author> fetchAll() {
        return this.authorRepository.findAll();
    }
}
