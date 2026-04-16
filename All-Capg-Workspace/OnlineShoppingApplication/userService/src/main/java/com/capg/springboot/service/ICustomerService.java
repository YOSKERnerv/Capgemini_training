package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.dto.CustomerDto;
import com.capg.springboot.entity.Customer;

public interface ICustomerService {
	Customer createCustomer(CustomerDto customerDto);
	Customer updateCustomer(String customerId, CustomerDto customerDto);
	Customer getCustomerById(String customerId);
	List<Customer> getAllCustomers();
	void deleteCustomer(String customerId);
}

