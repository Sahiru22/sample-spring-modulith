package com.example.demo_spring_modulith.customer.service;

import com.example.demo_spring_modulith.customer.domain.Customer;
import com.example.demo_spring_modulith.customer.dto.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer create(CustomerDTO form);

    Optional<Customer> getById(Long id);

    List<Customer> getAll();
}
