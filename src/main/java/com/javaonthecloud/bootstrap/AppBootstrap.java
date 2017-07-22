package com.javaonthecloud.bootstrap;

import com.javaonthecloud.model.Author;
import com.javaonthecloud.model.Book;
import com.javaonthecloud.model.Publisher;
import com.javaonthecloud.repository.AuthorRepository;
import com.javaonthecloud.repository.BookRepository;
import com.javaonthecloud.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by thales on 22/07/17.
 */
@Component
public class AppBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final AuthorRepository authorRepository;

    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    @Autowired
    public AppBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Author author = new Author();
        author.setName("Author");
        Author author1 = new Author();
        author1.setName("Author1");
        Set<Author> authors = new HashSet<>();
        authors.add(author);
        authors.add(author1);

        Publisher publisher = new Publisher();
        publisher.setName("publisher");

        Book book = new Book();
        book.setName("name");
        book.setPublisher(publisher);
        book.setAuthors(authors);

        this.bookRepository.save(book);
    }
}
