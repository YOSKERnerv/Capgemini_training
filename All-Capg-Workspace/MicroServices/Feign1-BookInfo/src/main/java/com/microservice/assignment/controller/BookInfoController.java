package com.microservice.assignment.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.assignment.model.BookDepo;
import com.microservice.assignment.model.BookInfo;

@RestController
@RequestMapping("/book")
public class BookInfoController {
	@GetMapping
    public Map<String, Object> getBook() {

        BookInfo book = new BookInfo();
        book.setBookID(101);
        book.setBookName("Spring Boot Guide");
        book.setBookAuthor("Sagar");
        book.setBookPrice(499);

        RestTemplate restTemplate = new RestTemplate();

        BookDepo depo = restTemplate.getForObject(
                "http://localhost:8081/depo",
                BookDepo.class);

        Map<String, Object> response = new HashMap<>();

        response.put("BookInfo", book);
        response.put("BookDepo", depo);

        return response;

	}
}
