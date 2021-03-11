package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.CaseFan;

public interface CaseFanRepository extends JpaRepository<CaseFan, Integer>{
	CaseFan findByCaseFanId(int caseFanId);
	List<CaseFan> findByAirflow(String airflow);
	List<CaseFan> findByColor(String color);
	List<CaseFan> findByMmSize(byte mmSize);
	List<CaseFan> findByNoiseLevel(String noiseLevel);
	List<CaseFan> findByPwm4Pin(String pwm4Pin);
	List<CaseFan> findByRpm(String rpm);
}
