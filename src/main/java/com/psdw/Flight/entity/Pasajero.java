package com.psdw.Flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author JEAN
 */
@Entity
@Table(name = "Pasajeros")
public class Pasajero {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer ID_Pasajero;
        private String nombre;

        public Integer getID_Pasajero() {
            return ID_Pasajero;
        }
        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setID_Pasajero(Integer ID_Pasajero) {
            this.ID_Pasajero = ID_Pasajero;
        }
        
}
