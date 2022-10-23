package com.psdw.Flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psdw.Flight.entity.Clase;
import com.psdw.Flight.repository.ClaseRepository;

@Service
public class ClaseService{
	@Autowired
	private ClaseRepository claseRepository;
	
	public Clase crearClase(Clase cls) {
		return claseRepository.save(cls);
	}
	
	public Clase actualizarClase(Clase cls) {
		return claseRepository.save(cls);
	}
	
	public List<Clase> listarClases(){
		return claseRepository.findAll();
	}
	
	public void eliminarClase(Clase cls) {
		claseRepository.deleteById(cls.getID_Clase());
	}
	
}
