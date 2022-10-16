package com.psdw.Flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psdw.Flight.entity.Silla;
import com.psdw.Flight.service.SillaService;

@RestController
@RequestMapping("sillas")
public class SillaController {
	
	@Autowired
	private SillaService sillaService;
	
	@GetMapping
	public List<Silla> listar(){
		return sillaService.listarSillas();
	}
	
	@PostMapping
	public Silla insertar(@RequestBody Silla silla) {
		return sillaService.CrearSilla(silla);
	}
	
	@PutMapping
	public Silla actualizar(@RequestBody Silla silla) {
		return sillaService.actualizarSilla(silla);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Silla silla) {
		sillaService.eliminar(silla);
	}

}
