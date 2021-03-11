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

}

