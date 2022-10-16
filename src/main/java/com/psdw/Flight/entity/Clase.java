package com.psdw.Flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Clases")
public class Clase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_Clase;
	private String nombre;
	
	
	public Integer getID_Clase() {
		return ID_Clase;
	}
	public void setID_Clase(Integer iD_Clase) {
		ID_Clase = iD_Clase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
