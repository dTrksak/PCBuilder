package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the os database table.
 * 
 */
@Entity
@Table(name="os")
@NamedQuery(name="O.findAll", query="SELECT o FROM O o")
public class O implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="os_id")
	private int osId;

	@Column(name="max_memory")
	private String maxMemory;

	private String mode;

	@Column(name="os_type")
	private String osType;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public O() {
	}

	public int getOsId() {
		return this.osId;
	}

	public void setOsId(int osId) {
		this.osId = osId;
	}

	public String getMaxMemory() {
		return this.maxMemory;
	}

	public void setMaxMemory(String maxMemory) {
		this.maxMemory = maxMemory;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}