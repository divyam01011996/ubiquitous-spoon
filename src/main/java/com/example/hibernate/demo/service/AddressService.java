package com.example.hibernate.demo.service;

import com.example.hibernate.demo.entity.Address;
import com.example.hibernate.demo.repo.AddressRepository;
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
