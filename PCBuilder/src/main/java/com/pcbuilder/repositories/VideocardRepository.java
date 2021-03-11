package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.VideoCard;



public interface VideoCardRepository extends JpaRepository<VideoCard, Integer> {
	
	VideoCard findByVideoCardId(int videoCardId);
	List<VideoCard> findByBoostClock(String boostClock);
	List<VideoCard> findByChipset(String chipset);
	List<VideoCard> findByColor(String color);
	List<VideoCard> findByCoreClock(String coreClock);
	List<VideoCard> findByVideoInterface(String videoInterface);
	List<VideoCard> findByMemory(String memory);

}
