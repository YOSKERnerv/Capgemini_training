package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.dto.AddressDto;
import com.capg.springboot.entity.Address;

public interface IAddressService {
	Address createAddress(AddressDto addressDto);
	Address updateAddress(String addressId, AddressDto addressDto);
	Address getAddressById(String addressId);
	List<Address> getAllAddresses();
	void deleteAddress(String addressId);
}

