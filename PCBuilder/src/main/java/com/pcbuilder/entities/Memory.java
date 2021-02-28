package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the memory database table.
 * 
 */
@Entity
@NamedQuery(name="Memory.findAll", query="SELECT m FROM Memory m")
public class Memory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="memory_id")
	private int memoryId;

	@Column(name="cas_latency")
	private byte casLatency;

	private String color;

	@Column(name="memory_type")
	private String memoryType;

	private String modules;

	@Column(name="price_per_gb")
	private double pricePerGb;

	private String speed;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Memory() {
	}

	public int getMemoryId() {
		return this.memoryId;
	}

	public void setMemoryId(int memoryId) {
		this.memoryId = memoryId;
	}

	public byte getCasLatency() {
		return this.casLatency;
	}

	public void setCasLatency(byte casLatency) {
		this.casLatency = casLatency;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMemoryType() {
		return this.memoryType;
	}

	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}

	public String getModules() {
		return this.modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public double getPricePerGb() {
		return this.pricePerGb;
	}

	public void setPricePerGb(double pricePerGb) {
		this.pricePerGb = pricePerGb;
	}

	public String getSpeed() {
		return this.speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}