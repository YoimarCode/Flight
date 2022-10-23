package com.psdw.Flight.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author JEAN
 */
@Entity
@Table(name = "Pasajero")
public class Pasajero {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_pasajero")
        private Integer id_Pasajero;
        
        @OneToMany(mappedBy="id_pasajero")
        Set<ReservaId> reserva_key;
        
        @Column(name = "nombre")
        private String nombre;

        public Integer getIDPasajero() {
            return id_Pasajero;
        }
        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setID_Pasajero(Integer ID_Pasajero) {
            this.id_Pasajero = ID_Pasajero;
        }
        
}
