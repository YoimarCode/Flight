/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psdw.Flight.entity;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import org.hibernate.annotations.GenerationTime;
/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "Reserva")
public class Reserva {
    @EmbeddedId
    private ReservaId id;
    
    @ManyToOne
    @MapsId("id_pasajero")
    @JoinColumn(name = "id_pasajero")
    private Pasajero pasajero;
    
    @ManyToOne
    @MapsId("id_silla")
    @JoinColumn(name = "Id_silla")
    private Silla silla;
    
    @Column(columnDefinition="serial",name="id_reserva")
    private Integer id_reserva;

    /**
     * @return the id
     */
    public ReservaId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setIdReserva(ReservaId id) {
        this.id = id;
    }

    /**
     * @return the pasajero
     */
    public Pasajero getPasajero() {
        return pasajero;
    }

    /**
     * @param pasajero the pasajero to set
     */
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    /**
     * @return the silla
     */
    public Silla getSilla() {
        return silla;
    }

    /**
     * @param silla the silla to set
     */
    public void setSilla(Silla silla) {
        this.silla = silla;
    }

    /**
     * @return the id_reserva
     */
    public Integer getIDReserva() {
        return id_reserva;
    }

    /**
     * @param id_reserva the id_reserva to set
     */
    public void setIdReserva(Integer id_reserva) {
        this.id_reserva = id_reserva;
    }
}
