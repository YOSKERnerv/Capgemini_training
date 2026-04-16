package com.capg.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.dto.CustomerDto;
import com.capg.springboot.entity.Customer;
import com.capg.springboot.repository.ICustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	private final ICustomerRepository customerRepository;

	public CustomerServiceImpl(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer createCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setCustomerId(customerDto.getCustomerId());
		customer.setCustomerName(customerDto.getCustomerName());
		customer.setCity(customerDto.getCity());
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(String customerId, CustomerDto customerDto) {
		Customer existing = getCustomerById(customerId);
		existing.setCustomerName(customerDto.getCustomerName());
		existing.setCity(customerDto.getCity());
		return customerRepository.save(existing);
	}

	@Override
	@Transactional(readOnly = true)
	public Customer getCustomerById(String customerId) {
		Customer customer = customerRepository.findByCustomerId(customerId);
		if (customer == null) {
			throw new IllegalArgumentException("Customer not found: " + customerId);
		}
		return customer;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(String customerId) {
		Customer existing = getCustomerById(customerId);
		customerRepository.delete(existing);
	}
}

