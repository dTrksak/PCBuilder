package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Ups;

public interface UpsRepository extends JpaRepository<Ups, Integer>{
	Ups findByUpsId(int upsId);
	List<Ups> findByCapacityVa(int capacityVa);
	List<Ups> findByCapacityW(int capacityW);
}
