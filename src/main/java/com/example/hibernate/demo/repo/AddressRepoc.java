package com.example.hibernate.demo.repo;

import com.example.hibernate.demo.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface AddressRepoc extends JpaRepository<Data, Integer> {
 
}