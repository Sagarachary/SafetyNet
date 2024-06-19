package com.Safety.DTO;

public class LoginDTO {

	
	private String email;
	private String password;
	private String address;
	private String gender;
	public LoginDTO(String address, String gender) {
		super();
		this.address = address;
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//	public LoginDTO1(String email, String password) {
//		super();
//		this.email = email;
//		this.password = password;
//	}
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", password=" + password + ", address=" + address + ", gender=" + gender
				+ "]";
	}
	
}
