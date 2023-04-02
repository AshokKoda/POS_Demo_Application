package com.example.managementproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.managementproject.Entities.Customers;
import com.example.managementproject.Services.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Save Customer
    @PostMapping("/createCustomer")
    public void saveCustomer(@RequestBody Customers customers){
        customerService.createCustomer(customers);
    }

    //Get All Customers List
    @GetMapping("/getAllCustomers")
    public List<Customers> getAllCustomersList(){
        return customerService.getAllCustomers();
    }

    //Update Customer
    @PutMapping("/updateCustomers/{id}")
    public ResponseEntity<Customers> updateCustomer(@RequestBody Customers customers, @PathVariable Integer id){
        try {
            Customers existCustomers = customerService.getByCustomerId(id);
            customerService.updateCustomer(customers);
            return new ResponseEntity<Customers>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomerById(id);
    }

    //Get customers by ID
    @GetMapping("/getAllCustomers/{id}")
    public ResponseEntity<Customers> fetchCustomerById(@PathVariable Integer id){
        try {
            Customers customers = customerService.getByCustomerId(id);
            return new ResponseEntity<Customers>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Customers>(HttpStatus.NOT_FOUND);
        }
    }

    //Get customers by RegNo
    @GetMapping("/getCustomersByRegno")
    public ResponseEntity<Customers> fetchCustomerByRegno(@Param(value = "regNo") String regNo){
        try {
            Customers customers = customerService.FetchByRegNo(regNo);
            return new ResponseEntity<Customers>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Customers>(HttpStatus.NOT_FOUND);
        }
    }
    
}
