package com.example.managementproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.managementproject.Entities.Customers;
import com.example.managementproject.Services.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Save Customer
    @PostMapping("/create")
    public void saveCustomer(Customers customers){
        customerService.createCustomer(customers);
    }

    //Get All Customers List
    @GetMapping("/getAllCustomers")
    public List<Customers> getAllCustomersList(){
        return customerService.getAllCustomers();
    }
    
}
