package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pcbuilder.entities.Memory;
import com.pcbuilder.entities.Motherboard;

public interface MemoryRepository extends JpaRepository<Memory, Integer>{
	
	Memory findByMemoryId(int memoryId);
	List<Memory> findByCasLatency(byte casLatency);
	List<Memory> findByColor(String color);
	List<Memory> findByMemoryType(String memoryType);
	List<Memory> findByPricePerGb(String pricePerGb);
	List<Memory> findBySpeed(String speed);
	
	@Query("select m from Memory m where m.ramGen = ?1 or ?1 is null")
	Page<Memory> findByCompatibility(String ramGen, Pageable pageable);
}
