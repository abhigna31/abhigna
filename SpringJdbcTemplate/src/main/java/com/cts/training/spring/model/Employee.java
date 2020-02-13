package com.cts.training.spring.model;

public class Employee {
	
	int id;
	String name;
	String email;
	long phone;
	
	
	public int getId() {
		return id;
	}
	
	
	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	

}
