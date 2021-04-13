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
	
	@Query(	value = "select * from motherboard, product where product.product_id = motherboard.product_id",// where socket_type = ?1 and ram_gen = ?2",
			countQuery = "select count(*) from motherboard, product where product.product_id = motherboard.product_id",// where socket_type = ?1 and ram_gen = ?2",
			nativeQuery = true)
	Page<Motherboard> findByCompatibility(String socketType, String ramGen, Pageable pageable);
}
