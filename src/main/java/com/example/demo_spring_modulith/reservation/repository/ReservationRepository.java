package com.example.demo_spring_modulith.reservation.repository;

import com.example.demo_spring_modulith.reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
