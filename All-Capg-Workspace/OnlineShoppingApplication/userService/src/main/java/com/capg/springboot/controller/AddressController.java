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

import com.capg.springboot.dto.AddressDto;
import com.capg.springboot.entity.Address;
import com.capg.springboot.service.IAddressService;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {
	private final IAddressService addressService;

	public AddressController(IAddressService addressService) {
		this.addressService = addressService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Address createAddress(@RequestBody AddressDto addressDto) {
		return addressService.createAddress(addressDto);
	}

	@GetMapping("/{addressId}")
	public Address getAddressById(@PathVariable String addressId) {
		return addressService.getAddressById(addressId);
	}

	@GetMapping
	public List<Address> getAllAddresses() {
		return addressService.getAllAddresses();
	}

	@PutMapping("/{addressId}")
	public Address updateAddress(@PathVariable String addressId, @RequestBody AddressDto addressDto) {
		return addressService.updateAddress(addressId, addressDto);
	}

	@DeleteMapping("/{addressId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAddress(@PathVariable String addressId) {
		addressService.deleteAddress(addressId);
	}
}

