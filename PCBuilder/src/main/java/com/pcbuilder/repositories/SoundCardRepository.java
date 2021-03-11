package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.SoundCard;

public interface SoundCardRepository extends JpaRepository<SoundCard, Integer>{
	SoundCard findBySoundCardId(int soundCardId);
	List<SoundCard> findByChannels(String channels);
	List<SoundCard> findByChipset(String chipset);
	List<SoundCard> findByDigitalAudio(String digitalAudio);
	List<SoundCard> findBySoundCardInterface(String soundCardInterface);
	List<SoundCard> findBySampleRate(String sampleRate);
	List<SoundCard> findBySnr(String snr);
}
