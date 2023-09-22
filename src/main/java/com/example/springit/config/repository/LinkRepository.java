package com.example.springit.config.repository;
import com.example.springit.config.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {
    Link findByTitle(String title);

}
