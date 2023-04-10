package com.example.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Address {

	@Id
	@GeneratedValue
	private Long id;
	private String address;
	@OneToOne
	private Employee employee;

}
