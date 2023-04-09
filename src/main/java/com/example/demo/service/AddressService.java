package com.example.service;

import com.example.entity.Address;
import com.example.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	public Address addAddress(Address address) {
		Address addressSavedToDB = this.addressRepository.save(address);
		return addressSavedToDB;
	}

}
