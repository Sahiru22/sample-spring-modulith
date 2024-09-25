package com.example.demo_spring_modulith.event;

import lombok.Data;

@Data

public class CustomerCreatedEvent {

    private final Long customerId;
}
