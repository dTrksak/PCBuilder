package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.CaseAccessory;

public interface CaseAccessoryRepository extends JpaRepository<CaseAccessory, Integer>{
	CaseAccessory findByCaseAccesssoryId(int caseAccesssoryId);
	List<CaseAccessory> findByAccType(String accType);
	List<CaseAccessory> findByFormFactor(double formFactor);
}
