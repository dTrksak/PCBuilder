package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Software;

public interface SoftwareRepository extends JpaRepository<Software, Integer>{
	Software findBySoftwareId(int softwareId);
	List<Software> findByMediaType(String mediaType);
	List<Software> findBySoftwareType(String softwareType);
}
