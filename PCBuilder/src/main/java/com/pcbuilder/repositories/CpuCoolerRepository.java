package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.CpuCooler;

public interface CpuCoolerRepository extends JpaRepository<CpuCooler, Integer>{
	
	CpuCooler findByCpuCoolerId(int cpuCoolerId);
	List<CpuCooler> findByColor(String color);
	List<CpuCooler> findByFanRpm(String fanRpm);
	List<CpuCooler> findByNoiseLevel(String noiseLevel);
	List<CpuCooler> findByRadiatorSize(String radiatorSize);
}
