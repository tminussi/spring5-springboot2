package com.javaonthecloud.repository;

import com.javaonthecloud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by thales on 22/07/17.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
