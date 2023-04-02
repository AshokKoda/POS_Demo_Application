package com.example.managementproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.managementproject.Entities.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
    
    @Query(value = "SELECT * from customers WHERE reg_no = :regNo", nativeQuery = true)
    Customers getByRegNCustomers(String regNo);
}
