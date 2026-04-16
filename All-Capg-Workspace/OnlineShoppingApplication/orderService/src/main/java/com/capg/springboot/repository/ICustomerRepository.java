package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, String> {
	Customer findByCustomerId(String customerId);
}

