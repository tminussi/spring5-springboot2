package com.javaonthecloud.repository;

import com.javaonthecloud.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by thales on 22/07/17.
 */
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
