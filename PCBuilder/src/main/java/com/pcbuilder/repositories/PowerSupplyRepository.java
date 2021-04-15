package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pcbuilder.entities.Motherboard;
import com.pcbuilder.entities.PcCase;
import com.pcbuilder.entities.PowerSupply;

public interface PowerSupplyRepository extends JpaRepository<PowerSupply, Integer>{
	PowerSupply findByPowerSupplyId(int powerSupplyId);
	List<PowerSupply> findByColor(String color);
	List<PowerSupply> findByEfficiencyRating(String efficiencyRating);
	List<PowerSupply> findByFormFactor(String formFactor);
	List<PowerSupply> findByModular(String modular);
	List<PowerSupply> findByTotalWattage(String wattage);
	
	@Query("select p from PowerSupply p where ?1 + ?2 <= p.totalWattage")
	Page<PowerSupply> findByCompatibility(int videoCardTdp, int cpuTdp, Pageable pageable);
}
