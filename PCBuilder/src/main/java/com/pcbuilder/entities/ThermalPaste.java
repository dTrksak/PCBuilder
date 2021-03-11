package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the thermal_paste database table.
 * 
 */
@Entity
@Table(name="thermal_paste")
@NamedQuery(name="ThermalPaste.findAll", query="SELECT t FROM ThermalPaste t")
public class ThermalPaste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="thermal_paste_id")
	private int thermalPasteId;

	private String amount;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public ThermalPaste() {
	}

	public int getThermalPasteId() {
		return this.thermalPasteId;
	}

	public void setThermalPasteId(int thermalPasteId) {
		this.thermalPasteId = thermalPasteId;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}