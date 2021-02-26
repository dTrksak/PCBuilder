package com.pcbuilder.model;

public class Person {
	int user_id = -1;
	String first_name = null;
	String last_name = null;
	String email = null;
	String password = null;
	
	public void setUserInfo(int user_id, String first_name, String last_name, String email, String password) {
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}
	
	public int getUserId() {
		return user_id;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
}
