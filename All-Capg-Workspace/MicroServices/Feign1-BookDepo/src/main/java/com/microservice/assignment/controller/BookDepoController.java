package com.microservice.assignment.controller;

import org.springframework.web.bind.annotation.*;
import com.microservice.assignment.model.BookDepo;

@RestController
@RequestMapping("/depo")
public class BookDepoController {
	 @GetMapping
	    public BookDepo getDepo() {

	        BookDepo depo = new BookDepo();
	        depo.setDepoID(1);
	        depo.setDepoAddress("Kolkata Warehouse");

	        return depo;
	    }
}
