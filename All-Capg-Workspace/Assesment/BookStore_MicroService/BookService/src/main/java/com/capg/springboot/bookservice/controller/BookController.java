package com.capg.springboot.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.capg.springboot.bookservice.model.Book;
import com.capg.springboot.bookservice.repository.BookRepository;

@RestController
@RequestMapping("/api/books")
public class BookController {

@Autowired
private BookRepository repository;

@GetMapping
public List<Book> getAllBooks(){
return repository.findAll();
}

@GetMapping("/{id}")
public ResponseEntity<Book> getBook(@PathVariable Long id){
return repository.findById(id)
.map(ResponseEntity::ok)
.orElse(ResponseEntity.notFound().build());
}

@PostMapping
public ResponseEntity<Book> createBook(@RequestBody Book book){
Book saved=repository.save(book);
return ResponseEntity.status(201).body(saved);
}

@PutMapping("/{id}")
public ResponseEntity<Book> updateBook(@PathVariable Long id,@RequestBody Book book){
return repository.findById(id).map(existing->{
existing.setTitle(book.getTitle());
existing.setAuthor(book.getAuthor());
existing.setIsbn(book.getIsbn());
existing.setPrice(book.getPrice());
existing.setQuantity(book.getQuantity());
existing.setCategory(book.getCategory());
return ResponseEntity.ok(repository.save(existing));
}).orElse(ResponseEntity.notFound().build());
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteBook(@PathVariable Long id){
repository.deleteById(id);
return ResponseEntity.noContent().build();
}
}