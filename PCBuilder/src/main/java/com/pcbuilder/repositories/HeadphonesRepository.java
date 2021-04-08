package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Headphone;

public interface HeadphonesRepository extends JpaRepository<Headphone, Integer>{
	Headphone findByHeadphonesId(int headphonesId);
	List<Headphone> findByColor(String Color);
	List<Headphone> findByEnclosureType(String enclosureType);
	List<Headphone> findByFrequencyResponse(String frequencyResponse);
	List<Headphone> findByHeadphonesType(String headphonesType);
	List<Headphone> findByMicrophone(String microphone);
	List<Headphone> findByWireless(String wireless);
}
