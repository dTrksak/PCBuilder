package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the video_card database table.
 * 
 */
@Entity
@Table(name="video_card")
@NamedQuery(name="VideoCard.findAll", query="SELECT v FROM VideoCard v")
public class VideoCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="video_card_id")
	private int videoCardId;

	@Column(name="boost_clock")
	private String boostClock;

	private String chipset;

	private String color;

	@Column(name="core_clock")
	private String coreClock;

	@Column(name="interface")
	private String videoInterface;

	private String memory;
	
	@Column(name="tdp_wattage")
	private int tdpWattage;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public VideoCard() {
	}

	public int getVideoCardId() {
		return this.videoCardId;
	}

	public void setVideoCardId(int videoCardId) {
		this.videoCardId = videoCardId;
	}

	public String getBoostClock() {
		return this.boostClock;
	}

	public void setBoostClock(String boostClock) {
		this.boostClock = boostClock;
	}

	public String getChipset() {
		return this.chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCoreClock() {
		return this.coreClock;
	}

	public void setCoreClock(String coreClock) {
		this.coreClock = coreClock;
	}

	public String getInterface() {
		return this.videoInterface;
	}

	public void setInterface_(String videoInterface) {
		this.videoInterface = videoInterface;
	}

	public String getMemory() {
		return this.memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getTdpWattage() {
		return tdpWattage;
	}

	public void setTdp(int tdpWattage) {
		this.tdpWattage = tdpWattage;
	}

}