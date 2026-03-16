package com.capg.springboot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookStoreEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreEurekaServerApplication.class, args);
        System.out.println("The book store eureka server is running on port number 8761");
    }
}