package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.VideoCard;



public interface VideoCardRepository extends JpaRepository<VideoCard, Integer> {
	
	VideoCard findByVideoCardId(int videoCardId);
	VideoCard findByBoostClock(String boostClock);
	VideoCard findByChipset(String chipset);
	VideoCard findByColor(String color);
	VideoCard findByCoreClock(String coreClock);
	VideoCard findByVideoInterface(String videoInterface);
	VideoCard findByMemory(String memory);

}
