package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.FanController;

public interface FanControllerRepository extends JpaRepository<FanController, Integer>{
	FanController findByFanControllerId(int fanControllerId);
	List<FanController> findByChannelWattage(String channelWattage);
	List<FanController> findByChannels(byte channels);
	List<FanController> findByColor(String color);
	List<FanController> findByFormFactor(String formFactor);
	List<FanController> findByPwm4Pin(String pwm4Pin);
}
