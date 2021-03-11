package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fan_controller database table.
 * 
 */
@Entity
@Table(name="fan_controller")
@NamedQuery(name="FanController.findAll", query="SELECT f FROM FanController f")
public class FanController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fan_controller_id")
	private int fanControllerId;

	@Column(name="channel_wattage")
	private String channelWattage;

	private byte channels;

	private String color;

	@Column(name="form_factor")
	private String formFactor;

	@Column(name="pwm_4_pin")
	private String pwm4Pin;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public FanController() {
	}

	public int getFanControllerId() {
		return this.fanControllerId;
	}

	public void setFanControllerId(int fanControllerId) {
		this.fanControllerId = fanControllerId;
	}

	public String getChannelWattage() {
		return this.channelWattage;
	}

	public void setChannelWattage(String channelWattage) {
		this.channelWattage = channelWattage;
	}

	public byte getChannels() {
		return this.channels;
	}

	public void setChannels(byte channels) {
		this.channels = channels;
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

	public String getPwm4Pin() {
		return this.pwm4Pin;
	}

	public void setPwm4Pin(String pwm4Pin) {
		this.pwm4Pin = pwm4Pin;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}