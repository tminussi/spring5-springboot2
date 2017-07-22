package com.javaonthecloud.service;

import com.javaonthecloud.model.Publisher;
import com.javaonthecloud.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thales on 22/07/17.
 */
@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;

    @Autowired
    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public List<Publisher> fetchAll() {
        return this.publisherRepository.findAll();
    }
}
