package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.InternalHarddrive;

public interface InternalHarddriveRepository extends JpaRepository<InternalHarddrive, Integer>{
	InternalHarddrive findByInternalHarddriveId(int internalHarddriveId);
	List<InternalHarddrive> findByCache(String cache);
	List<InternalHarddrive> findByCapacity(String capacity);
	List<InternalHarddrive> findByFormFactor(String formFactor);
	List<InternalHarddrive> findByHarddriveType(String harddriveType);
	List<InternalHarddrive> findByHarddriveInterface(String harddriveInterface);
	List<InternalHarddrive> findByPricePerGb(double pricePerGb);
}
