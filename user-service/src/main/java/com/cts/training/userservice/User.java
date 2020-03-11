package com.cts.training.userservice;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table(name = "register_table")
@XmlRootElement(name="reg")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private long phone;
	private String password;
	private String role="ROLE_USER";
@Transient
private String regStatus;
private Boolean active=false;

User(){}


public User(int id, String username, String firstname, String lastname, String email, long phone, String password,
		String role, String regStatus, Boolean active) {
	super();
	this.id = id;
	this.username = username;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.phone = phone;
	this.password = password;
	this.role = role;
	this.regStatus = regStatus;
	this.active = active;
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
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getRegStatus() {
	return regStatus;
}
public void setRegStatus(String regStatus) {
	this.regStatus = regStatus;
}
public Boolean getActive() {
	return active;
}
public void setActive(Boolean active) {
	this.active = active;
}
public static long getSerialversionuid() {
	return serialVersionUID;
	
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", email=" + email + ", phone=" + phone + ", password=" + password + ", role=" + role + ", regStatus="
			+ regStatus + ", active=" + active + "]";
}
}
  
			
	