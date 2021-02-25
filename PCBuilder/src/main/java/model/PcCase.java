package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pc_case database table.
 * 
 */
@Entity
@Table(name="pc_case")
@NamedQuery(name="PcCase.findAll", query="SELECT p FROM PcCase p")
public class PcCase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="case_id")
	private int caseId;

	@Column(name="case_type")
	private String caseType;

	private String color;

	@Column(name="external_bays")
	private byte externalBays;

	@Column(name="internal_bays")
	private byte internalBays;

	@Column(name="power_supply")
	private String powerSupply;

	@Column(name="side_panel_window")
	private String sidePanelWindow;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public PcCase() {
	}

	public int getCaseId() {
		return this.caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}

	public String getCaseType() {
		return this.caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getExternalBays() {
		return this.externalBays;
	}

	public void setExternalBays(byte externalBays) {
		this.externalBays = externalBays;
	}

	public byte getInternalBays() {
		return this.internalBays;
	}

	public void setInternalBays(byte internalBays) {
		this.internalBays = internalBays;
	}

	public String getPowerSupply() {
		return this.powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public String getSidePanelWindow() {
		return this.sidePanelWindow;
	}

	public void setSidePanelWindow(String sidePanelWindow) {
		this.sidePanelWindow = sidePanelWindow;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}