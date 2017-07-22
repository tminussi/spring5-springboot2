package com.javaonthecloud.controller;

import com.javaonthecloud.controller.view.AuthorView;
import com.javaonthecloud.service.AuthorService;
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
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public Collection<AuthorView> fetchAll() {
        return AuthorView.toCollection(this.authorService.fetchAll());
    }
}
