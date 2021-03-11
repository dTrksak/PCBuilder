package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sound_card database table.
 * 
 */
@Entity
@Table(name="sound_card")
@NamedQuery(name="SoundCard.findAll", query="SELECT s FROM SoundCard s")
public class SoundCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sound_card_id")
	private int soundCardId;

	private String channels;

	private String chipset;

	@Column(name="digital_audio")
	private String digitalAudio;

	@Column(name="interface")
	private String soundCardInterface;

	@Column(name="sample_rate")
	private String sampleRate;

	private String snr;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public SoundCard() {
	}

	public int getSoundCardId() {
		return this.soundCardId;
	}

	public void setSoundCardId(int soundCardId) {
		this.soundCardId = soundCardId;
	}

	public String getChannels() {
		return this.channels;
	}

	public void setChannels(String channels) {
		this.channels = channels;
	}

	public String getChipset() {
		return this.chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public String getDigitalAudio() {
		return this.digitalAudio;
	}

	public void setDigitalAudio(String digitalAudio) {
		this.digitalAudio = digitalAudio;
	}

	public String getSoundCardInterface() {
		return this.soundCardInterface;
	}

	public void setSoundCardInterface(String soundCardInterface) {
		this.soundCardInterface = soundCardInterface;
	}

	public String getSampleRate() {
		return this.sampleRate;
	}

	public void setSampleRate(String sampleRate) {
		this.sampleRate = sampleRate;
	}

	public String getSnr() {
		return this.snr;
	}

	public void setSnr(String snr) {
		this.snr = snr;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}