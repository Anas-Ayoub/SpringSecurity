package com.xproce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xproce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
    List<Customer> findByEmail(String email);
}
