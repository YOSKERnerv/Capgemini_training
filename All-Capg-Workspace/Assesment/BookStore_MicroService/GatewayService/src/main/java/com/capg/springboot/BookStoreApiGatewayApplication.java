package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApiGatewayApplication.class, args);
		System.out.println("The gateway for the book store is running on port number 8090");
	}

}
