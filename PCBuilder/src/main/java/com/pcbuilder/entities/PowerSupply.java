package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the power_supply database table.
 * 
 */
@Entity
@Table(name="power_supply")
@NamedQuery(name="PowerSupply.findAll", query="SELECT p FROM PowerSupply p")
public class PowerSupply implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="power_supply_id")
	private int powerSupplyId;

	private String color;

	@Column(name="efficiency_rating")
	private String efficiencyRating;

	@Column(name="form_factor")
	private String formFactor;

	private String modular;

	private String wattage;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public PowerSupply() {
	}

	public int getPowerSupplyId() {
		return this.powerSupplyId;
	}

	public void setPowerSupplyId(int powerSupplyId) {
		this.powerSupplyId = powerSupplyId;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEfficiencyRating() {
		return this.efficiencyRating;
	}

	public void setEfficiencyRating(String efficiencyRating) {
		this.efficiencyRating = efficiencyRating;
	}

	public String getFormFactor() {
		return this.formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public String getModular() {
		return this.modular;
	}

	public void setModular(String modular) {
		this.modular = modular;
	}

	public String getWattage() {
		return this.wattage;
	}

	public void setWattage(String wattage) {
		this.wattage = wattage;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}