package com.example.hibernate.demo.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CustomerService {
    default CustomerData saveCustomer(CustomerData customer)
    {
        return customer;
    };
    default boolean deleteCustomer(Long customerId){
        return false;
    }

    default List< CustomerData > getAllCustomers() {
        return null;
    }

    default CustomerData getCustomerById(Long customerId) {
        return null;
    }


}
