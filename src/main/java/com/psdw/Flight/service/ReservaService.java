/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psdw.Flight.service;

import com.psdw.Flight.entity.Reserva;
import com.psdw.Flight.repository.ReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class ReservaService {
    @Autowired
        private ReservaRepository reservaRepository;
        
        public Reserva crearReserva(Reserva rs){
                return reservaRepository.save(rs);
        }
        
        public Reserva actualizarReserva(Reserva rs){
                return reservaRepository.save(rs);
        }
        
        public List<Reserva> listarReservas(){
                return reservaRepository.findAll();
        }
        
        public void eliminarReservas(Reserva rs){
                reservaRepository.deleteById(rs.getIDReserva());
        }
    
}
