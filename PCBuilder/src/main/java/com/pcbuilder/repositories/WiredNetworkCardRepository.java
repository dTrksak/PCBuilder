package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.WiredNetworkCard;

public interface WiredNetworkCardRepository extends JpaRepository<WiredNetworkCard, Integer>{
	WiredNetworkCard findByWiredNetworkCardId(int wiredNetworkCardId);
	List<WiredNetworkCard> findByColor(String color);
	List<WiredNetworkCard> findByWiredNetworkCarInterface(String wiredNetworkCarInterface);
	List<WiredNetworkCard> findByPorts(String ports);
}
