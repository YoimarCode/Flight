/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psdw.Flight.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Carlos
 */
@Embeddable
public class ReservaId implements Serializable{
    @Column(name="id_pasajero")
    Integer id_pasajero;
    
    @Column(name="id_silla")
    Integer id_silla;

}