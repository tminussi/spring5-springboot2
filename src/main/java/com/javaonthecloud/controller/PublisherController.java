package com.javaonthecloud.controller;

import com.javaonthecloud.model.Publisher;
import com.javaonthecloud.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by thales on 22/07/17.
 */
@RestController
@RequestMapping("/api")
public class PublisherController {

    private final PublisherService publisherService;

    @Autowired
    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("/publishers")
    public List<Publisher> fetchAll() {
        return this.publisherService.fetchAll();
    }
}
