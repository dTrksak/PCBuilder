package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Memory extends JpaRepository<Memory, Integer>{
	
	Memory findById(int memoryId);
	Memory findByCasLatency(byte casLatency);
	Memory findByColor(String color);
	Memory findByMemoryType(String memory_type);
	Memory findByPricePerGb(String pricePerGb);
	Memory findBySpeed(String speed);
	
}
