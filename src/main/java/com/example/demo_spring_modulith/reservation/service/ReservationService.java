package com.example.demo_spring_modulith.reservation.service;

import com.example.demo_spring_modulith.reservation.domain.Reservation;
import com.example.demo_spring_modulith.reservation.dto.ReservationDTO;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    Reservation create(ReservationDTO form);

    Optional<Reservation> getById(Long id);

    List<Reservation> getAll();
}
