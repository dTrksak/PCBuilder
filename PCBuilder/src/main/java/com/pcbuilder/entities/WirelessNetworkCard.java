package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wireless_network_card database table.
 * 
 */
@Entity
@Table(name="wireless_network_card")
@NamedQuery(name="WirelessNetworkCard.findAll", query="SELECT w FROM WirelessNetworkCard w")
public class WirelessNetworkCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="wireless_network_card_id")
	private int wirelessNetworkCardId;

	private String color;

	@Column(name="interface")
	private String wirelessNetworkCardInterface;

	private String protocol;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public WirelessNetworkCard() {
	}

	public int getWirelessNetworkCardId() {
		return this.wirelessNetworkCardId;
	}

	public void setWirelessNetworkCardId(int wirelessNetworkCardId) {
		this.wirelessNetworkCardId = wirelessNetworkCardId;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWirelessNetworkCardInterface() {
		return this.wirelessNetworkCardInterface;
	}

	public void setWirelessNetworkCardInterface(String wirelessNetworkCardInterface) {
		this.wirelessNetworkCardInterface = wirelessNetworkCardInterface;
	}

	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}