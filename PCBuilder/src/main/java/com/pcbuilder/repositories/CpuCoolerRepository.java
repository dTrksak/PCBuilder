package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pcbuilder.entities.Cpu;
import com.pcbuilder.entities.CpuCooler;

public interface CpuCoolerRepository extends JpaRepository<CpuCooler, Integer>{
	CpuCooler findByCpuCoolerId(int cpuCoolerId);
	List<CpuCooler> findByColor(String color);
	List<CpuCooler> findByFanRpm(String fanRpm);
	List<CpuCooler> findByNoiseLevel(String noiseLevel);
	List<CpuCooler> findByRadiatorSize(String radiatorSize);
	
	@Query("select c from CpuCooler c where c.socketType = ?1 or ?1 is null")
	Page<CpuCooler> findByCompatibility(String socketType, Pageable pageable);
}
