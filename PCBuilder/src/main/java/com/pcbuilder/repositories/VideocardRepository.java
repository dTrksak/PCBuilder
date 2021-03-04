package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.VideoCard;



public interface VideocardRepository extends JpaRepository<VideoCard, Integer> {
	
	VideoCard findByID(int videoCardId);
	VideoCard findByBoostClock(String boostClosk);
	VideoCard findByChipset(String chipset);
	VideoCard findByColor(String color);
	VideoCard findByCoreClock(String coreClock);
	VideoCard findByInterface(String interface_);
	VideoCard findByMemory(String memory);

}
