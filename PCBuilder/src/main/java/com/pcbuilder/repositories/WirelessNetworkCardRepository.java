package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.WirelessNetworkCard;

public interface WirelessNetworkCardRepository extends JpaRepository<WirelessNetworkCard, Integer>{
	WirelessNetworkCard findByWirelessNetworkCardId(int wirelessNetworkCardId);
	List<WirelessNetworkCard> findByColor(String color);
	List<WirelessNetworkCard> findByWirelessNetworkCardInterface(String wirelessNetworkCardInterface);
	List<WirelessNetworkCard> findByProtocol(String protocol);
}
