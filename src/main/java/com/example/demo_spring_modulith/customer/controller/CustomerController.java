package com.example.demo_spring_modulith.customer.controller;

import com.example.demo_spring_modulith.customer.domain.Customer;
import com.example.demo_spring_modulith.customer.service.CustomerService;
import com.example.demo_spring_modulith.customer.dto.CustomerDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    @PostMapping("")
    public Customer create(@RequestBody CustomerDTO form) {
        return customerService.create(form);
    }

    @GetMapping("/{id}")
    public Optional<Customer> getById(@PathVariable Long id) {
        return customerService.getById(id);
    }

    @GetMapping()
    public List<Customer> list() {
        return customerService.getAll();
    }
}
