package com.psdw.Flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psdw.Flight.entity.Silla;
import com.psdw.Flight.repository.SillaRepository;

@Service
public class SillaService {
	
	@Autowired
	private SillaRepository sillaRepo;
	
	public Silla CrearSilla(Silla silla) {
		return sillaRepo.save(silla);
	}
	
	public Silla actualizarSilla(Silla silla) {
		return sillaRepo.save(silla);
	}
	
	public List<Silla> listarSillas() {
		return sillaRepo.findAll();
	}
	
	public void eliminar(Silla silla) {
		sillaRepo.deleteById(silla.getID_Silla());
	}
	
	
}
