package com.victorm.principal.util;

import java.time.LocalDate;

public class LoginUser {
	String username;
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
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDob() {
		return this.dob;
	}
	
	String password;
	String dob;
}
