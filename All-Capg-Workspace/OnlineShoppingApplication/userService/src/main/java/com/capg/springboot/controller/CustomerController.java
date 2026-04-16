package com.capg.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.dto.CustomerDto;
import com.capg.springboot.entity.Customer;
import com.capg.springboot.service.ICustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	private final ICustomerService customerService;

	public CustomerController(ICustomerService customerService) {
		this.customerService = customerService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Customer createCustomer(@RequestBody CustomerDto customerDto) {
		return customerService.createCustomer(customerDto);
	}

	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable String customerId) {
		return customerService.getCustomerById(customerId);
	}

	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@PutMapping("/{customerId}")
	public Customer updateCustomer(@PathVariable String customerId, @RequestBody CustomerDto customerDto) {
		return customerService.updateCustomer(customerId, customerDto);
	}

	@DeleteMapping("/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable String customerId) {
		customerService.deleteCustomer(customerId);
	}
}

