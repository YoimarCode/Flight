package com.psdw.Flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psdw.Flight.entity.Silla;

@Repository
public interface SillaRepository extends JpaRepository<Silla, Integer>{
	
}
