package com.aurum.struts.model;

public class User {
	
	private String id;
	private String email;
	private String mobileNumber;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String id, String email, String mobileNumber) {
		this.id = id;
		this.email = email;
		this.mobileNumber = mobileNumber; 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
