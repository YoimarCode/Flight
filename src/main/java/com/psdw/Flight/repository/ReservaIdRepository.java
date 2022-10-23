/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.psdw.Flight.repository;

import com.psdw.Flight.entity.Reserva;
import com.psdw.Flight.entity.ReservaId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos
 */
public interface ReservaIdRepository extends JpaRepository<Reserva, ReservaId>{
    
}
