package com.capg.springboot.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.springboot.bookservice.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
}