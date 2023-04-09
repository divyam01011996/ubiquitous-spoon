package com.example.repo;

import com.example.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface AddressRepoc extends JpaRepository<Data, Integer> {
 
}