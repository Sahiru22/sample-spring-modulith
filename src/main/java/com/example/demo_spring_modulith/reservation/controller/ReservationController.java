package com.example.demo_spring_modulith.reservation.controller;

import com.example.demo_spring_modulith.customer.domain.Customer;
import com.example.demo_spring_modulith.customer.dto.CustomerDTO;
import com.example.demo_spring_modulith.reservation.domain.Reservation;
import com.example.demo_spring_modulith.reservation.dto.ReservationDTO;
import com.example.demo_spring_modulith.reservation.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    @PostMapping("")
    public Reservation create(@RequestBody ReservationDTO form) {
        return reservationService.create(form);
    }

    @GetMapping("/{id}")
    public Optional<Reservation> getById(@PathVariable Long id) {
        return reservationService.getById(id);
    }

    @GetMapping()
    public List<Reservation> list() {
        return reservationService.getAll();
    }
}
