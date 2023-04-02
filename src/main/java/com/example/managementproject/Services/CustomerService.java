package com.example.managementproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.managementproject.Entities.Customers;
import com.example.managementproject.Repositories.CustomersRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomersRepository customersRepository;

    //Create
    public void createCustomer(Customers customers) {
        customersRepository.save(customers);
    }

    //Read
    public List<Customers> getAllCustomers(){
        return customersRepository.findAll();
    }

    //Update
    public void updateCustomer() {
        //
    }

    //Delete
    public void deleteCustomer() {
        //
    }
    
}
