package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.ExternalHarddrive;

public interface ExternalHarddriveRepository extends JpaRepository<ExternalHarddrive, Integer>{
	ExternalHarddrive findByExternalHarddriveId(int externalHarddriveId);
	List<ExternalHarddrive> findByCapacity(String capacity);
	List<ExternalHarddrive> findByColor(String color);
	List<ExternalHarddrive> findByHardriveType(String hardriveType);
	List<ExternalHarddrive> findByHarddriveInterface(String harddriveInterface);
	List<ExternalHarddrive> findByPricePerGb(double priceperGb);
}
