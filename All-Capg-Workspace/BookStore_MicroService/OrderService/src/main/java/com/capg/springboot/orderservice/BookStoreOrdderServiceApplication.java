package com.capg.springboot.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreOrdderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreOrdderServiceApplication.class, args);
		System.out.println("book store order service is running on port 8082");
	}

}
