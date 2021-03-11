package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Memory;

public interface MemoryRepository extends JpaRepository<Memory, Integer>{
	
	Memory findByMemoryId(int memoryId);
	List<Memory> findByCasLatency(byte casLatency);
	List<Memory> findByColor(String color);
	List<Memory> findByMemoryType(String memoryType);
	List<Memory> findByPricePerGb(String pricePerGb);
	List<Memory> findBySpeed(String speed);
	
}
