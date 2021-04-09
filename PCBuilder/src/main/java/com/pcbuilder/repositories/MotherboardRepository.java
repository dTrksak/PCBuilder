package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Motherboard;
import com.pcbuilder.entities.Product;

public interface MotherboardRepository extends JpaRepository<Motherboard, Integer>{
	Motherboard findByMotherboardId(int motherboardId);
	List<Motherboard> findByColor(String color);
	List<Motherboard> findByFormFactor(String formFactor);
	List<Motherboard> findByMaxRam(String maxRam);
	List<Motherboard> findByRamSlots(byte ramSlots);
	List<Motherboard> findBySocketType(String socketType);
	Motherboard findByProduct(Product product);
}
