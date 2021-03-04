package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.VideoCard;



public interface VideoCardRepository extends JpaRepository<VideoCard, Integer> {
	
	VideoCard findByvideoCardId(int videoCardId);
	VideoCard findByboostClock(String boostClock);
	VideoCard findBychipset(String chipset);
	VideoCard findBycolor(String color);
	VideoCard findBycoreClock(String coreClock);
	VideoCard findByinterface_(String interface_);
	VideoCard findBymemory(String memory);

}
