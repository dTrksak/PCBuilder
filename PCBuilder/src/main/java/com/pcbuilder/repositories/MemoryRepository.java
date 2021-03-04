package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Memory;

public interface MemoryRepository extends JpaRepository<Memory, Integer>{
	
	Memory findByMemoryId(int memoryId);
	Memory findByCasLatency(byte casLatency);
	Memory findByColor(String color);
	Memory findByMemoryType(String memoryType);
	Memory findByPricePerGb(String pricePerGb);
	Memory findBySpeed(String speed);
	
}
