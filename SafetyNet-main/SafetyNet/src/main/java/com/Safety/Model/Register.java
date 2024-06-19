package com.Safety.Model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "Register")
public class Register {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String username;

private String email;

private String address;

private String password;

private String mobile;			   

 private String gender;
	/*
	 * private Boolean enable; private String verificationcode;
	 * 
	 * public Boolean getEnable() { return enable; }
	 * 
	 * public void setEnable(Boolean enable) { this.enable = false; }
	 * 
	 * public String getVerificationcode() { return verificationcode; }
	 * 
	 * public void setVerificationcode(String verificationcode) {
	 * this.verificationcode = UUID.randomUUID().toString(); }
	 */

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Register(int id, String username, String email, String address, String password, String mobile,
			String gender) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.address = address;
		this.password = password;
		this.mobile = mobile;
		this.gender = gender;
}

	public int getId() {
		return id;
	}

	/*
	 * @Override public String toString() { return "Register [id=" + id +
	 * ", username=" + username + ", email=" + email + ", address=" + address +
	 * ", password=" + password + ", mobile=" + mobile + ", gender=" + gender +
	 * ", enable=" + enable + ", verificationcode=" + verificationcode + "]"; }
	 */

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
//
//	public Register(int id, String username, String email, String address, String password, String mobile,
//			String gender, Boolean enable, String verificationcode) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.email = email;
//		this.address = address;
//		this.password = password;
//		this.mobile = mobile;
//		this.gender = gender;
//		this.enable = enable;
//		this.verificationcode = verificationcode;
//	}



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
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


}
