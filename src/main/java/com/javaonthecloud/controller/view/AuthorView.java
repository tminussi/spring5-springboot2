package com.javaonthecloud.controller.view;

import com.javaonthecloud.model.Author;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by thales on 22/07/17.
 */
public class AuthorView {

    private Long authorId;

    private String authorName;

    private Collection<BookView> books;

    public AuthorView(Author author) {
        this.authorId = author.getId();
        this.authorName = author.getName();
        this.books = BookView.toList(author.getBooks());
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Collection<BookView> getBooks() {
        return books;
    }

    public void setBooks(Collection<BookView> books) {
        this.books = books;
    }

    public static AuthorView toView(Author author) {
        return new AuthorView(author);
    }

    public static Collection<AuthorView> toCollection(Collection<Author> authors) {
        if (authors.isEmpty()) {
            return new ArrayList<>();
        }
        return authors
                .stream()
                .map(AuthorView::toView)
                .collect(Collectors.toList());
    }
}
