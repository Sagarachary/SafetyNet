package com.Safety.DTO;

import jakarta.persistence.Column;

public class UserDTO {

private int id; 
public UserDTO(int id, String username, String email, String address, String password, String mobile, String gender) {
	super();
	this.id = id;
	this.username = username;
	this.email = email;
	this.address = address;
	this.password = password;
	this.mobile = mobile;
	this.Gender = gender;
}
private String username;	  
private String email;	   
private String address;	
@Override
public String toString() {
	return "UserDTO [id=" + id + ", username=" + username + ", email=" + email + ", address=" + address + ", password="
			+ password + ", mobile=" + mobile + ", Gender=" + Gender + "]";
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public UserDTO() {
	super();
	// TODO Auto-generated constructor stub
}
private String password;
private String mobile;			
private String Gender;
/*
 * private Boolean enable; private String verificationcode; public Boolean
 * getEnable() { return enable; } public void setEnable(Boolean enable) {
 * this.enable = enable; } public String getVerificationcode() { return
 * verificationcode; } public void setVerificationcode(String verificationcode)
 * { this.verificationcode = verificationcode; }
 */
}
