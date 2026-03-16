package com.microservice.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.order.client")
public class Feign1BookInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Feign1BookInfoApplication.class, args);
	}

}
