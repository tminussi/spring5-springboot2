package com.javaonthecloud.controller.view;

import com.javaonthecloud.model.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by thales on 22/07/17.
 */
public class BookView {

    private Long bookId;

    private String bookName;

    public BookView(Book book) {
        this.bookId = book.getId();
        this.bookName = book.getName();
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public static Collection<BookView> toList(Set<Book> books) {
        if (books.isEmpty()) {
            return new ArrayList<>();
        }
        return books
                .stream()
                .map(BookView::toView)
                .collect(Collectors.toList());
    }

    private static BookView toView(Book book) {
        return new BookView(book);
    }
}
