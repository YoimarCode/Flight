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

import com.psdw.Flight.entity.Clase;
import com.psdw.Flight.service.ClaseService;

@RestController
@RequestMapping("/clases")
public class ClaseController {
	@Autowired
	private ClaseService clService;
	
	@GetMapping
	public List<Clase> listar(){
		return clService.listarClases();
	}
	
	@PostMapping
	public Clase insertar(@RequestBody Clase cls) {
		return clService.crearClase(cls);
	}
	
	@PutMapping
	public Clase actualizar(@RequestBody Clase cls) {
		return clService.actualizarClase(cls);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Clase cls) {
		clService.eliminarClase(cls);
	}
		
}
