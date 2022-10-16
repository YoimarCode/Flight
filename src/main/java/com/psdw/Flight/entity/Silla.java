package com.psdw.Flight.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Sillas")
public class Silla {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_Silla;
	
	@JoinColumn(name = "fk_Clase", nullable = false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Clase clase;
	
	
	public Clase getClase() {
		return clase;
	}
	public void setClase(Clase clase) {
		this.clase = clase;
	}
	private String isOccupied;
	private Integer numero;
	
	public Integer getID_Silla() {
		return ID_Silla;
	}
	public void setID_Silla(Integer iD_Silla) {
		ID_Silla = iD_Silla;
	}
	public String getIsOccupied() {
		return isOccupied;
	}
	public void setIsOccupied(String isOccupied) {
		this.isOccupied = isOccupied;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
	
}
