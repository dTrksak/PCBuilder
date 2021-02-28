package model;

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
	private int cpu_Id; //id for entity

	@Column(name="boost_clock")
	private String boostClock;

	@Column(name="core_clock")
	private String coreClock;

	@Column(name="core_count")
	private byte coreCount;

	@Column(name="cpuid")
	private int cpuId; //id in mysql

	@Column(name="cpu_name")
	private String cpuName;

	@Column(name="cpu_speed")
	private int cpuSpeed;

	@Column(name="integrated_graphics")
	private String integratedGraphics;

	private String smt;

	private String tdp;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Cpu() {
	}

	public int getCpu_Id() {
		return this.cpu_Id;
	}

	public void setCpu_Id(int cpu_Id) {
		this.cpu_Id = cpu_Id;
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

	public int getCpuId() {
		return this.cpuId;
	}

	public void setCpuId(int cpuId) {
		this.cpuId = cpuId;
	}

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
	}

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

	public String getTdp() {
		return this.tdp;
	}

	public void setTdp(String tdp) {
		this.tdp = tdp;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}