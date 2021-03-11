package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the external_harddrive database table.
 * 
 */
@Entity
@Table(name="external_harddrive")
@NamedQuery(name="ExternalHarddrive.findAll", query="SELECT e FROM ExternalHarddrive e")
public class ExternalHarddrive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="external_harddrive_id")
	private int externalHarddriveId;

	private String capacity;

	private String color;

	@Column(name="hardrive_type")
	private String hardriveType;

	@Column(name="interface")
	private String harddriveInterface;

	@Column(name="price_per_gb")
	private double pricePerGb;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public ExternalHarddrive() {
	}

	public int getExternalHarddriveId() {
		return this.externalHarddriveId;
	}

	public void setExternalHarddriveId(int externalHarddriveId) {
		this.externalHarddriveId = externalHarddriveId;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getHardriveType() {
		return this.hardriveType;
	}

	public void setHardriveType(String hardriveType) {
		this.hardriveType = hardriveType;
	}

	public String getHarddriveInterface() {
		return this.harddriveInterface;
	}

	public void setHarddriveInterface(String harddriveInterface) {
		this.harddriveInterface = harddriveInterface;
	}

	public double getPricePerGb() {
		return this.pricePerGb;
	}

	public void setPricePerGb(double pricePerGb) {
		this.pricePerGb = pricePerGb;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}