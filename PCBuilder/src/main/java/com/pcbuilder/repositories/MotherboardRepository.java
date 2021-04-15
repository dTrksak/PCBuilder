package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pcbuilder.entities.Motherboard;
import com.pcbuilder.entities.Product;

public interface MotherboardRepository extends JpaRepository<Motherboard, Integer>{
	Motherboard findByMotherboardId(int motherboardId);
	List<Motherboard> findByColor(String color);
	List<Motherboard> findByFormFactor(String formFactor);
	List<Motherboard> findByRamGen(String ramGen);
	List<Motherboard> findByRamSlots(byte ramSlots);
	List<Motherboard> findBySocketType(String socketType);
	Motherboard findByProduct(Product product);
	
	@Query("select m from Motherboard m where (m.socketType = ?1 or ?1 is null) and (m.ramGen = ?2 or ?2 is null) and (m.formFactor = ?3 or ?3 is null)")
	Page<Motherboard> findByCompatibility(String socketType, String ramGen, String formFactor, Pageable pageable);
}
