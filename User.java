package com.cts.training.model;

public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private long phone;
	private boolean enaled;
	
	public User() {
		
	}
	

	public User(int id, String username, String password, String email, long phone, boolean enaled) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.enaled = enaled;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean isEnaled() {
		return enaled;
	}

	public void setEnaled(boolean enaled) {
		this.enaled = enaled;
	}
	

}
