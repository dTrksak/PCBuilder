package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Integer>{
	Speaker findBySpeakersId(int speakersId);
	List<Speaker> findByColor(String color);
	List<Speaker> findByConfiguration(String configuration);
	List<Speaker> findByFrequencyResponse(String frequencyResponse);
	List<Speaker> findByTotalWattage(String totalWattage);
}
