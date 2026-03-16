package com.capg.springboot.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.capg.springboot.orderservice.dto.BookDTO;

import java.util.List;

@FeignClient(name="book-service")
public interface BookClient {

@GetMapping("/api/books")
List<BookDTO> getAllBooks();

@GetMapping("/api/books/{id}")
BookDTO getBookById(@PathVariable Long id);

@PostMapping("/api/books")
BookDTO createBook(@RequestBody BookDTO book);

@PutMapping("/api/books/{id}")
BookDTO updateBook(@PathVariable Long id,@RequestBody BookDTO book);

@DeleteMapping("/api/books/{id}")
void deleteBook(@PathVariable Long id);
}