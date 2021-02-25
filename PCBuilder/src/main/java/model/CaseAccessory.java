package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the case_accessory database table.
 * 
 */
@Entity
@Table(name="case_accessory")
@NamedQuery(name="CaseAccessory.findAll", query="SELECT c FROM CaseAccessory c")
public class CaseAccessory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="case_accesssory_id")
	private int caseAccesssoryId;

	@Column(name="acc_type")
	private String accType;

	@Column(name="form_factor")
	private double formFactor;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public CaseAccessory() {
	}

	public int getCaseAccesssoryId() {
		return this.caseAccesssoryId;
	}

	public void setCaseAccesssoryId(int caseAccesssoryId) {
		this.caseAccesssoryId = caseAccesssoryId;
	}

	public String getAccType() {
		return this.accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getFormFactor() {
		return this.formFactor;
	}

	public void setFormFactor(double formFactor) {
		this.formFactor = formFactor;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}