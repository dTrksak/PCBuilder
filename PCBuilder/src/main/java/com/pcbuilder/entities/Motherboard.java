package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the motherboard database table.
 * 
 */
@Entity
@NamedQuery(name="Motherboard.findAll", query="SELECT m FROM Motherboard m")
public class Motherboard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="motherboard_id")
	private int motherboardId;

	private String color;

	@Column(name="form_factor")
	private String formFactor;

	@Column(name="max_ram")
	private String maxRam;

	@Column(name="ram_slots")
	private byte ramSlots;

	@Column(name="socket_per_cpu")
	private String socketPerCpu;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Motherboard() {
	}

	public int getMotherboardId() {
		return this.motherboardId;
	}

	public void setMotherboardId(int motherboardId) {
		this.motherboardId = motherboardId;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFormFactor() {
		return this.formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public String getMaxRam() {
		return this.maxRam;
	}

	public void setMaxRam(String maxRam) {
		this.maxRam = maxRam;
	}

	public byte getRamSlots() {
		return this.ramSlots;
	}

	public void setRamSlots(byte ramSlots) {
		this.ramSlots = ramSlots;
	}

	public String getSocketPerCpu() {
		return this.socketPerCpu;
	}

	public void setSocketPerCpu(String socketPerCpu) {
		this.socketPerCpu = socketPerCpu;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}