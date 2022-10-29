package com.psdw.Flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psdw.Flight.entity.Reserva;
import com.psdw.Flight.repository.ReservaRepository;

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
            reservaRepository.deleteById(rs.getID_Reserva());
    }

}
