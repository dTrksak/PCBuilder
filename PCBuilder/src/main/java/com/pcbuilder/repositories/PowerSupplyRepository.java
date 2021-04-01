package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.PowerSupply;

public interface PowerSupplyRepository extends JpaRepository<PowerSupply, Integer>{
	PowerSupply findByPowerSupplyId(int powerSupplyId);
	List<PowerSupply> findByColor(String color);
	List<PowerSupply> findByEfficiencyRating(String efficiencyRating);
	List<PowerSupply> findByFormFactor(String formFactor);
	List<PowerSupply> findByModular(String modular);
	List<PowerSupply> findByTotalWattage(String wattage);
}
