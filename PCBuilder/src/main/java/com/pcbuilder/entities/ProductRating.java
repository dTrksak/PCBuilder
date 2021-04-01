package com.pcbuilder.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "product_rating")
@NamedQuery(name = "ProductRating.findAll", query = "SELECT pr FROM ProductRating pr")
public class ProductRating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "rating_id")
	private int ratingId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	private byte active;

	private String rating;

	private String comment;

	@Column(name = "created_date")
	private Timestamp createdDate;

	@Column(name = "updated_data")
	private Timestamp updatedData;

	public ProductRating() {
	}

	public int getRatingId() {
		return ratingId;
	}

	public User getUser() {
		return user;
	}

	public Product getProduct() {
		return product;
	}

	public byte getActive() {
		return active;
	}

	public String getRating() {
		return rating;
	}

	public String getComment() {
		return comment;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public Timestamp getUpdatedData() {
		return updatedData;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedData(Timestamp updatedData) {
		this.updatedData = updatedData;
	}
}
