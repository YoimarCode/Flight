package com.psdw.Flight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Clase")
public class Clase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_clase")
	private Integer id_Clase;
        
        @Column(name = "nombre")
	private String nombre;
	
	
	public Integer getID_Clase() {
		return id_Clase;
	}
	public void setID_Clase(Integer iD_Clase) {
		id_Clase = iD_Clase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
