package com.psdw.Flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "Reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_Reserva;
    
    @JoinColumn(name = "fk_pasajero")
    @ManyToOne
    private Pasajero pasajero;
    
    @JoinColumn(name = "fk_silla")
    @ManyToOne
    private Silla silla;

	public Integer getID_Reserva() {
		return ID_Reserva;
	}

	public void setID_Reserva(Integer iD_Reserva) {
		ID_Reserva = iD_Reserva;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Silla getSilla() {
		return silla;
	}

	public void setSilla(Silla silla) {
		this.silla = silla;
	}
    
    

}
