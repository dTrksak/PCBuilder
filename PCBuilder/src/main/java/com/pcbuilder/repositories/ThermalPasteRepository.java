package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.ThermalPaste;

public interface ThermalPasteRepository extends JpaRepository<ThermalPaste, Integer>{
	ThermalPaste findByThermalPasteId(int thermalPasteId);
	List<ThermalPaste> findByAmount(String amount);
}
