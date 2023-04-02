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

    // Create
    public void createCustomer(Customers customers) {
        customersRepository.save(customers);
    }

    // Read
    public List<Customers> getAllCustomers() {
        List<Customers> customerList = customersRepository.findAll();
        return customerList;

    }

    // Update
    public void updateCustomer(Customers customers) {
        customersRepository.save(customers);
    }

    // Delete
    public void deleteCustomerById(Integer id) {
        customersRepository.deleteById(id);
    }

    //Fetch by ID
    public Customers getByCustomerId(Integer id){
        return customersRepository.findById(id).get();
    }

    //Fetch by RegNo
    public Customers FetchByRegNo(String regNo){
        return customersRepository.getByRegNCustomers(regNo);
    }

}
