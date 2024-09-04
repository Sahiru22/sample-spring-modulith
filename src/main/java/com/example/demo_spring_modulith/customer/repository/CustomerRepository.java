package com.example.demo_spring_modulith.customer.repository;

import com.example.demo_spring_modulith.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
