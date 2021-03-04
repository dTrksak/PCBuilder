package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Memory extends JpaRepository<Memory, Integer>{
	
	Memory findBymemoryId(int memoryId);
	Memory findBycasLatency(byte casLatency);
	Memory findBycolor(String color);
	Memory findBymemory_type(String memory_type);
	Memory findBypricePerGb(String pricePerGb);
	Memory findByspeed(String speed);
	
}
