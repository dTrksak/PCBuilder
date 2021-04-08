package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the internal_harddrive database table.
 * 
 */
@Entity
@Table(name="internal_harddrive")
@NamedQuery(name="InternalHarddrive.findAll", query="SELECT i FROM InternalHarddrive i")
public class InternalHarddrive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="internal_harddrive_id")
	private int internalHarddriveId;

	private String cache;

	private String capacity;

	@Column(name="form_factor")
	private String formFactor;

	@Column(name="harddrive_type")
	private String harddriveType;

	@Column(name="interface")
	private String harddriveInterface;

	@Column(name="price_per_gb")
	private double pricePerGb;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public InternalHarddrive() {
	}

	public int getInternalHarddriveId() {
		return this.internalHarddriveId;
	}

	public void setInternalHarddriveId(int internalHarddriveId) {
		this.internalHarddriveId = internalHarddriveId;
	}

	public String getCache() {
		return this.cache;
	}

	public void setCache(String cache) {
		this.cache = cache;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getFormFactor() {
		return this.formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public String getHarddriveType() {
		return this.harddriveType;
	}

	public void setHarddriveType(String harddriveType) {
		this.harddriveType = harddriveType;
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