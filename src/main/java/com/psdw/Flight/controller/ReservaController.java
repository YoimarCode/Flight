/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psdw.Flight.controller;

import com.psdw.Flight.entity.Pasajero;
import com.psdw.Flight.entity.Reserva;
import com.psdw.Flight.service.PasajeroService;
import com.psdw.Flight.service.ReservaService;
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
 * @author Carlos
 */
@RestController
@RequestMapping("reservas")
public class ReservaController {
    @Autowired
	private ReservaService reservaService;
	
	@GetMapping
	public List<Reserva> listar(){
		return reservaService.listarReservas();
	}
	
	@PostMapping
	public Reserva insertar(@RequestBody Reserva reserva) {
		return reservaService.crearReserva(reserva);
	}
	
	@PutMapping
	public Reserva actualizar(@RequestBody Reserva reserva) {
		return reservaService.actualizarReserva(reserva);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Reserva reserva) {
		reservaService.eliminarReservas(reserva);
	}
    
}
