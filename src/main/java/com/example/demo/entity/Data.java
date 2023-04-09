package com.example.entity;

import javax.persistence.*;
import java.util.Set;

@javax.persistence.Entity
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int data_id;
    @Column
    private Long salary;
    @Column
    private String dept;

    @OneToMany(cascade = CascadeType.ALL )
    public Set<Customer> customer;

    public int getData_id() {
        return data_id;
    }

    public void setData_id(int data_id) {
        this.data_id = data_id;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }
}
