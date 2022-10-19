/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psdw.Flight.controller;

import com.psdw.Flight.entity.Pasajero;
import com.psdw.Flight.service.PasajeroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JEAN
 */
@RestController
@RequestMapping("/Pasajeros")
public class PasajeroController {
        @Autowired
        private PasajeroService psService;
        
        @GetMapping
        public List<Pasajero> Listar(){
                return psService.listarPasajeros();
        }
        
        @PostMapping
        public Pasajero insertar(@RequestBody Pasajero ps){
                return psService.crearPasajero(ps);
        }
        
        @PutMapping
        public Pasajero actualizar(@RequestBody Pasajero ps){
                return psService.actualizarPasajero(ps);
        }
        
        @DeleteMapping
        public void eliminar(@RequestBody Pasajero ps){
                psService.eliminarPasajero(ps);
        }
}
