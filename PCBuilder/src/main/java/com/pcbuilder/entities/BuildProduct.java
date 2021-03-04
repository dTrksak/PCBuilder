package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the build_product database table.
 * 
 */

/*
@Entity
@Table(name="build_product")
@NamedQuery(name="BuildProduct.findAll", query="SELECT b FROM BuildProduct b")
public class BuildProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="build_product_id")
	private int buildProductId;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public BuildProduct() {
	}

	public int getBuildProductId() {
		return this.buildProductId;
	}

	public void setBuildProductId(int buildProductId) {
		this.buildProductId = buildProductId;
	}

	Build not yet created, uncomment once Build is created
	//bi-directional many-to-one association to Build
	@ManyToOne
	@JoinColumn(name="build_id")
	private Build build;

	public Build getBuild() {
		return this.build;
	}

	public void setBuild(Build build) {
		this.build = build;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
*/