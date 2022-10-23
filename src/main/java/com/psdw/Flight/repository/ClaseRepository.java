package com.psdw.Flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psdw.Flight.entity.Clase;

@Repository
public interface ClaseRepository extends JpaRepository<Clase, Integer>{
	
}
