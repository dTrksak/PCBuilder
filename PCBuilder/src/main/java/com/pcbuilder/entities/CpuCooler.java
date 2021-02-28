package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cpu_cooler database table.
 * 
 */
@Entity
@Table(name="cpu_cooler")
@NamedQuery(name="CpuCooler.findAll", query="SELECT c FROM CpuCooler c")
public class CpuCooler implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cpu_cooler_id")
	private int cpuCoolerId;

	private String color;

	@Column(name="fan_rpm")
	private String fanRpm;

	@Column(name="noise_level")
	private String noiseLevel;

	@Column(name="radiator_size")
	private String radiatorSize;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public CpuCooler() {
	}

	public int getCpuCoolerId() {
		return this.cpuCoolerId;
	}

	public void setCpuCoolerId(int cpuCoolerId) {
		this.cpuCoolerId = cpuCoolerId;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFanRpm() {
		return this.fanRpm;
	}

	public void setFanRpm(String fanRpm) {
		this.fanRpm = fanRpm;
	}

	public String getNoiseLevel() {
		return this.noiseLevel;
	}

	public void setNoiseLevel(String noiseLevel) {
		this.noiseLevel = noiseLevel;
	}

	public String getRadiatorSize() {
		return this.radiatorSize;
	}

	public void setRadiatorSize(String radiatorSize) {
		this.radiatorSize = radiatorSize;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}