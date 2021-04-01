package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cpu database table.
 * 
 */
@Entity
@NamedQuery(name="Cpu.findAll", query="SELECT c FROM Cpu c")
public class Cpu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cpu_id")
	private int cpuId;

	@Column(name="boost_clock")
	private String boostClock;

	@Column(name="core_clock")
	private String coreClock;

	@Column(name="core_count")
	private byte coreCount;

	/* legacy 
	@Column(name="cpu_name")
	private String cpuName;

	@Column(name="cpu_speed")
	private int cpuSpeed;*/
	
	@Column(name="integrated_graphics")
	private String integratedGraphics;

	private String smt;

	@Column(name="tdp_wattage")
	private int tdpWattage;
	
	@Column(name="socket_type")
	private String socketType;
	
	private String mode;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Cpu() {
	}

	public int getCpuId() {
		return this.cpuId;
	}

	public void setCpuId(int cpuId) {
		this.cpuId = cpuId;
	}

	public String getBoostClock() {
		return this.boostClock;
	}

	public void setBoostClock(String boostClock) {
		this.boostClock = boostClock;
	}

	public String getCoreClock() {
		return this.coreClock;
	}

	public void setCoreClock(String coreClock) {
		this.coreClock = coreClock;
	}

	public byte getCoreCount() {
		return this.coreCount;
	}

	public void setCoreCount(byte coreCount) {
		this.coreCount = coreCount;
	}

	/* legacy
	public String getCpuName() {
		return this.cpuName;
	}

	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}

	public int getCpuSpeed() {
		return this.cpuSpeed;
	}

	public void setCpuSpeed(int cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}*/

	public String getIntegratedGraphics() {
		return this.integratedGraphics;
	}

	public void setIntegratedGraphics(String integratedGraphics) {
		this.integratedGraphics = integratedGraphics;
	}

	public String getSmt() {
		return this.smt;
	}

	public void setSmt(String smt) {
		this.smt = smt;
	}

	public int getTdpWattage() {
		return this.tdpWattage;
	}

	public void setTdpWattage(int tdpWattage) {
		this.tdpWattage = tdpWattage;
	}
	
	public String getSocketType() {
		return this.socketType;
	}

	public void setSocketType(String socketType) {
		this.socketType = socketType;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}