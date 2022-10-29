package com.psdw.Flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psdw.Flight.entity.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
