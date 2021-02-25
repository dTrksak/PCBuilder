package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the headphones database table.
 * 
 */
@Entity
@Table(name="headphones")
@NamedQuery(name="Headphone.findAll", query="SELECT h FROM Headphone h")
public class Headphone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="headphones_id")
	private int headphonesId;

	private String color;

	@Column(name="enclosure_type")
	private String enclosureType;

	@Column(name="frequency_response")
	private String frequencyResponse;

	@Column(name="headphones_type")
	private String headphonesType;

	private String microphone;

	private String wireless;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Headphone() {
	}

	public int getHeadphonesId() {
		return this.headphonesId;
	}

	public void setHeadphonesId(int headphonesId) {
		this.headphonesId = headphonesId;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEnclosureType() {
		return this.enclosureType;
	}

	public void setEnclosureType(String enclosureType) {
		this.enclosureType = enclosureType;
	}

	public String getFrequencyResponse() {
		return this.frequencyResponse;
	}

	public void setFrequencyResponse(String frequencyResponse) {
		this.frequencyResponse = frequencyResponse;
	}

	public String getHeadphonesType() {
		return this.headphonesType;
	}

	public void setHeadphonesType(String headphonesType) {
		this.headphonesType = headphonesType;
	}

	public String getMicrophone() {
		return this.microphone;
	}

	public void setMicrophone(String microphone) {
		this.microphone = microphone;
	}

	public String getWireless() {
		return this.wireless;
	}

	public void setWireless(String wireless) {
		this.wireless = wireless;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}