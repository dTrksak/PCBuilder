package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the optical_drive database table.
 * 
 */
@Entity
@Table(name="optical_drive")
@NamedQuery(name="OpticalDrive.findAll", query="SELECT o FROM OpticalDrive o")
public class OpticalDrive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="optical_drive_id")
	private int opticalDriveId;

	private Byte bd;

	@Column(name="bd_write")
	private String bdWrite;

	private Byte cd;

	@Column(name="cd_write")
	private String cdWrite;

	private Byte dvd;

	@Column(name="dvd_write")
	private String dvdWrite;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public OpticalDrive() {
	}

	public int getOpticalDriveId() {
		return this.opticalDriveId;
	}

	public void setOpticalDriveId(int opticalDriveId) {
		this.opticalDriveId = opticalDriveId;
	}

	public Byte getBd() {
		return this.bd;
	}

	public void setBd(Byte bd) {
		this.bd = bd;
	}

	public String getBdWrite() {
		return this.bdWrite;
	}

	public void setBdWrite(String bdWrite) {
		this.bdWrite = bdWrite;
	}

	public Byte getCd() {
		return this.cd;
	}

	public void setCd(Byte cd) {
		this.cd = cd;
	}

	public String getCdWrite() {
		return this.cdWrite;
	}

	public void setCdWrite(String cdWrite) {
		this.cdWrite = cdWrite;
	}

	public Byte getDvd() {
		return this.dvd;
	}

	public void setDvd(Byte dvd) {
		this.dvd = dvd;
	}

	public String getDvdWrite() {
		return this.dvdWrite;
	}

	public void setDvdWrite(String dvdWrite) {
		this.dvdWrite = dvdWrite;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}