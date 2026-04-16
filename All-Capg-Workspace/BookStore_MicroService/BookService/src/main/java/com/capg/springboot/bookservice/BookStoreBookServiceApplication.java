package com.capg.springboot.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreBookServiceApplication.class, args);
		System.out.println("The book service is running on 8081");
	}

}
