package com.example.controller;

import com.example.entity.Employee;
import com.example.service.CustomerData;
import com.example.service.CustomerService;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/customers" , consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"} )
public class CustomerController {

    @Resource(name = "customerService")
    private CustomerService customerService;

    /**
     * <p>Get all customer data in the system.For production system you many want to use
     * pagination.</p>
     * @return List<CustomerData>
     */
    @GetMapping
    public List < CustomerData > getCustomers() {
        return customerService.getAllCustomers();
    }

    /**
     * Method to get the customer data based on the ID.
     * @param id
     * @return CustomerData
     */
    @GetMapping("/customer/{id}")
    public CustomerData getCustomer(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    /**
     * Post request to create customer information int the system.
     * @param customerData
     * @return
     */
    @PostMapping("/customer")
    public CustomerData saveCustomer(final @RequestBody CustomerData customerData) {
        return customerService.saveCustomer(customerData);
    }

    /**
     * <p>Delete customer from the system based on the ID. The method mapping is like the getCustomer with difference of
     * @DeleteMapping and @GetMapping</p>
     * @param id
     * @return
     */
    @DeleteMapping("/customer/{id}")
    public Boolean deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) throws Exception{
        Employee employeeSavedToDB = this.employeeService.addEmployee(employee);
        return new ResponseEntity<Employee>(employeeSavedToDB, HttpStatus.CREATED);
    }
}