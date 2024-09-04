package com.example.demo_spring_modulith.customer.service.impl;

import com.example.demo_spring_modulith.customer.domain.Customer;
import com.example.demo_spring_modulith.customer.repository.CustomerRepository;
import com.example.demo_spring_modulith.customer.service.CustomerService;
import com.example.demo_spring_modulith.customer.dto.CustomerDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Override
    public Customer create(CustomerDTO form) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(form, customer);
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> getById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
