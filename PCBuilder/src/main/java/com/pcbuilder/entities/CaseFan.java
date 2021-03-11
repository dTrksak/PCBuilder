package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the case_fan database table.
 * 
 */
@Entity
@Table(name="case_fan")
@NamedQuery(name="CaseFan.findAll", query="SELECT c FROM CaseFan c")
public class CaseFan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="case_fan_id")
	private int caseFanId;

	private String airflow;

	private String color;

	@Column(name="mm_size")
	private byte mmSize;

	@Column(name="noise_level")
	private String noiseLevel;

	@Column(name="pwm_4_pin")
	private String pwm4Pin;

	private String rpm;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public CaseFan() {
	}

	public int getCaseFanId() {
		return this.caseFanId;
	}

	public void setCaseFanId(int caseFanId) {
		this.caseFanId = caseFanId;
	}

	public String getAirflow() {
		return this.airflow;
	}

	public void setAirflow(String airflow) {
		this.airflow = airflow;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getMmSize() {
		return this.mmSize;
	}

	public void setMmSize(byte mmSize) {
		this.mmSize = mmSize;
	}

	public String getNoiseLevel() {
		return this.noiseLevel;
	}

	public void setNoiseLevel(String noiseLevel) {
		this.noiseLevel = noiseLevel;
	}

	public String getPwm4Pin() {
		return this.pwm4Pin;
	}

	public void setPwm4Pin(String pwm4Pin) {
		this.pwm4Pin = pwm4Pin;
	}

	public String getRpm() {
		return this.rpm;
	}

	public void setRpm(String rpm) {
		this.rpm = rpm;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}