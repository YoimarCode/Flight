/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psdw.Flight.service;

import com.psdw.Flight.entity.Pasajero;
import com.psdw.Flight.repository.PasajeroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JEAN
 */
@Service
public class PasajeroService {
        @Autowired
        private PasajeroRepository pasajeroRepository;
        
        public Pasajero crearPasajero(Pasajero ps){
                return pasajeroRepository.save(ps);
        }
        
        public Pasajero actualizarPasajero(Pasajero ps){
                return pasajeroRepository.save(ps);
        }
        
        public List<Pasajero> listarPasajeros(){
                return pasajeroRepository.findAll();
        }
        
        public void eliminarPasajero(Pasajero ps){
                pasajeroRepository.deleteById(ps.getID_Pasajero());
        }
}
