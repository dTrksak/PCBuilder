package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wired_network_card database table.
 * 
 */
@Entity
@Table(name="wired_network_card")
@NamedQuery(name="WiredNetworkCard.findAll", query="SELECT w FROM WiredNetworkCard w")
public class WiredNetworkCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="wired_network_card_id")
	private int wiredNetworkCardId;

	private String color;

	@Column(name="interface")
	private String wiredNetworkCarInterface;

	private String ports;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public WiredNetworkCard() {
	}

	public int getWiredNetworkCardId() {
		return this.wiredNetworkCardId;
	}

	public void setWiredNetworkCardId(int wiredNetworkCardId) {
		this.wiredNetworkCardId = wiredNetworkCardId;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWredNetworkCarInterface() {
		return this.wiredNetworkCarInterface;
	}

	public void setWiredNetworkCarInterface(String wiredNetworkCarInterface) {
		this.wiredNetworkCarInterface = wiredNetworkCarInterface;
	}

	public String getPorts() {
		return this.ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}