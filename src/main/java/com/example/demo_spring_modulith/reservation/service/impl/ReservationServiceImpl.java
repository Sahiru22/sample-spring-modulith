package com.example.demo_spring_modulith.reservation.service.impl;

import com.example.demo_spring_modulith.event.CustomerCreatedEvent;
import com.example.demo_spring_modulith.reservation.domain.Reservation;
import com.example.demo_spring_modulith.reservation.dto.ReservationDTO;
import com.example.demo_spring_modulith.reservation.repository.ReservationRepository;
import com.example.demo_spring_modulith.reservation.service.ReservationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    @Override
    public Reservation create(ReservationDTO form) {
        Reservation reservation = new Reservation();
        BeanUtils.copyProperties(form, reservation);
        return reservationRepository.save(reservation);
    }

    @EventListener(CustomerCreatedEvent.class)
    public void handleCustomerCreated(CustomerCreatedEvent event){
        log.info("handleCustomerCreated" + event.getCustomerId());
    }

    @Override
    public Optional<Reservation> getById(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }
}
