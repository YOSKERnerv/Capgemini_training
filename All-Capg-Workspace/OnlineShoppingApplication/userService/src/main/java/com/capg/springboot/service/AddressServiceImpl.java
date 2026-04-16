package com.capg.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.dto.AddressDto;
import com.capg.springboot.entity.Address;
import com.capg.springboot.repository.IAddressRepository;

@Service
@Transactional
public class AddressServiceImpl implements IAddressService {
	private final IAddressRepository addressRepository;

	public AddressServiceImpl(IAddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public Address createAddress(AddressDto addressDto) {
		Address address = new Address();
		address.setAddressId(addressDto.getAddressId());
		address.setCity(addressDto.getCity());
		address.setAddressLine(addressDto.getAddressLine());
		return addressRepository.save(address);
	}

	@Override
	public Address updateAddress(String addressId, AddressDto addressDto) {
		Address existing = getAddressById(addressId);
		existing.setCity(addressDto.getCity());
		existing.setAddressLine(addressDto.getAddressLine());
		return addressRepository.save(existing);
	}

	@Override
	@Transactional(readOnly = true)
	public Address getAddressById(String addressId) {
		Address address = addressRepository.findByAddressId(addressId);
		if (address == null) {
			throw new IllegalArgumentException("Address not found: " + addressId);
		}
		return address;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Address> getAllAddresses() {
		return addressRepository.findAll();
	}

	@Override
	public void deleteAddress(String addressId) {
		Address existing = getAddressById(addressId);
		addressRepository.delete(existing);
	}
}

