package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ups database table.
 * 
 */
@Entity
@Table(name="ups")
@NamedQuery(name="Up.findAll", query="SELECT u FROM Up u")
public class Up implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ups_id")
	private int upsId;

	@Column(name="capacity_va")
	private int capacityVa;

	@Column(name="capacity_w")
	private int capacityW;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Up() {
	}

	public int getUpsId() {
		return this.upsId;
	}

	public void setUpsId(int upsId) {
		this.upsId = upsId;
	}

	public int getCapacityVa() {
		return this.capacityVa;
	}

	public void setCapacityVa(int capacityVa) {
		this.capacityVa = capacityVa;
	}

	public int getCapacityW() {
		return this.capacityW;
	}

	public void setCapacityW(int capacityW) {
		this.capacityW = capacityW;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}