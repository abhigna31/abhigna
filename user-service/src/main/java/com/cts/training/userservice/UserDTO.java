package com.cts.training.userservice;

public class UserDTO {

	private int id;
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private long phone;
	private String password;
	public UserDTO() {
	}
	
	
	public UserDTO(int id, String username, String firstname, String lastname, String email, long phone,
			String password) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.password = password;
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
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", phone=" + phone + ", password=" + password + "]";
	}
	
	
}
	