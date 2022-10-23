package com.psdw.Flight.entity;


import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Silla")
public class Silla {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_pasajero")
	private Integer id_Silla;
	
	@JoinColumn(name = "id_Clase", nullable = false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Clase clase;
	
        @OneToMany(mappedBy="id_silla")
        Set<ReservaId> reserva_key;
	
	public Clase getClase() {
		return clase;
	}
	public void setClase(Clase clase) {
		this.clase = clase;
	}
	private String isOccupied;
	private Integer numero;
	
	public Integer getID_Silla() {
		return id_Silla;
	}
	public void setID_Silla(Integer iD_Silla) {
		id_Silla = iD_Silla;
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
