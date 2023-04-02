package com.example.managementproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.managementproject.Entities.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {
    
}
