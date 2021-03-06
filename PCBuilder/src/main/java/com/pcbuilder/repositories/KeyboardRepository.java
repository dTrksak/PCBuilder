package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Keyboard;

public interface KeyboardRepository extends JpaRepository<Keyboard, Integer>{
	Keyboard findByKeyboardId(int keyboardId);
	List<Keyboard> findByBacklit(String backlit);
	List<Keyboard> findByColor(String color);
	List<Keyboard> findByConnectionType(String connectionType);
	List<Keyboard> findByStyle(String style);
	List<Keyboard> findBySwitchType(String switchType);
	List<Keyboard> findByTenkeyless(String tenkeyless);
}
