package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the speakers database table.
 * 
 */
@Entity
@Table(name="speakers")
@NamedQuery(name="Speaker.findAll", query="SELECT s FROM Speaker s")
public class Speaker implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="speakers_id")
	private int speakersId;

	private String color;

	private String configuration;

	@Column(name="frequency_response")
	private String frequencyResponse;

	@Column(name="total_wattage")
	private String totalWattage;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Speaker() {
	}

	public int getSpeakersId() {
		return this.speakersId;
	}

	public void setSpeakersId(int speakersId) {
		this.speakersId = speakersId;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getFrequencyResponse() {
		return this.frequencyResponse;
	}

	public void setFrequencyResponse(String frequencyResponse) {
		this.frequencyResponse = frequencyResponse;
	}

	public String getTotalWattage() {
		return this.totalWattage;
	}

	public void setTotalWattage(String totalWattage) {
		this.totalWattage = totalWattage;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}