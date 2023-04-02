package com.example.managementproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.managementproject.Entities.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
    
}
