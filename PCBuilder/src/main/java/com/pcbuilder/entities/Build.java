package com.pcbuilder.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="build")
@NamedQuery(name="Build.findAll", query="SELECT b FROM Build b")
public class Build  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="build_id")
	private int buildId;
	
	//bi-directional many-to-one association to Build
	@ManyToOne
	@JoinColumn(name="user_id")
     private User user;
	
	@Column(name="active")
     private boolean active;
	@Column(name="created_date")
     private Timestamp createdDate;
	@Column(name="updated_data")
     private Timestamp updatedData;
	
	@Column(name="os_type")
	private String osType;
	@Column(name="socket_type")
	private String socketType;
	@Column(name="form_factor")
	private String formFactor;
	@Column(name="ram_gen")
	private String ramGen;
	@Column(name="ram_slots")
	private int ramSlots;
	@Column(name="total_tdp")
	private int totalTdp;
	@Column(name="cpu_tdp")
	private int cpuTdp;
	@Column(name="video_card_tdp")
	private int videoCardTdp;

    public Build() {
    }
   
    public Integer getBuildId() {
        return this.buildId;
    }
    
    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    public Date getUpdatedData() {
        return this.updatedData;
    }
    
    public void setUpdatedData(Timestamp updatedData) {
        this.updatedData = updatedData;
    }

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getSocketType() {
		return socketType;
	}

	public void setSocketType(String socketType) {
		this.socketType = socketType;
	}

	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public String getRamGen() {
		return ramGen;
	}

	public void setRamGen(String ramGen) {
		this.ramGen = ramGen;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public void setRamSlots(int ramSlots) {
		this.ramSlots = ramSlots;
	}

	public int getTotalTdp() {
		return totalTdp;
	}

	public void setTotalTdp(int totalTdp) {
		this.totalTdp = totalTdp;
	}

	public int getCpuTdp() {
		return cpuTdp;
	}

	public void setCpuTdp(int cpuTdp) {
		this.cpuTdp = cpuTdp;
	}

	public int getVideoCardTdp() {
		return videoCardTdp;
	}

	public void setVideoCardTdp(int videoCardTdp) {
		this.videoCardTdp = videoCardTdp;
	}

}

