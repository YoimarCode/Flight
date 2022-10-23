package com.psdw.Flight.repository;

import com.psdw.Flight.entity.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JEAN
 */
@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, Integer>{
    
}
