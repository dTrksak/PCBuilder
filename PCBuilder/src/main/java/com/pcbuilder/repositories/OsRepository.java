package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Os;

public interface OsRepository extends JpaRepository<Os, Integer>{
	Os findByOsId(int osId);
	List<Os> findByMaxMemory(String maxMemory);
	List<Os> findByMode(String mode);
	List<Os> findByOsType(String osType);
}
