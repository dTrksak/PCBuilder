package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the monitor database table.
 * 
 */
@Entity
@NamedQuery(name="Monitor.findAll", query="SELECT m FROM Monitor m")
public class Monitor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="monitor_id")
	private int monitorId;

	@Column(name="aspect_ratio")
	private String aspectRatio;

	@Column(name="panel_type")
	private String panelType;

	@Column(name="refresh_rate")
	private String refreshRate;

	private String resolution;

	@Column(name="`response_time_(g2g)`")
	private String responseTime_g2g_;

	@Column(name="screen_size")
	private String screenSize;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Monitor() {
	}

	public int getMonitorId() {
		return this.monitorId;
	}

	public void setMonitorId(int monitorId) {
		this.monitorId = monitorId;
	}

	public String getAspectRatio() {
		return this.aspectRatio;
	}

	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public String getPanelType() {
		return this.panelType;
	}

	public void setPanelType(String panelType) {
		this.panelType = panelType;
	}

	public String getRefreshRate() {
		return this.refreshRate;
	}

	public void setRefreshRate(String refreshRate) {
		this.refreshRate = refreshRate;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getResponseTime_g2g_() {
		return this.responseTime_g2g_;
	}

	public void setResponseTime_g2g_(String responseTime_g2g_) {
		this.responseTime_g2g_ = responseTime_g2g_;
	}

	public String getScreenSize() {
		return this.screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}