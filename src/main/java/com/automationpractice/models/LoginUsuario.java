package com.automationpractice.models;

public class LoginUsuario {

	String email = "";
	String password = "";

	public LoginUsuario(String email, String password) {

		this.email = email;
		this.password = password;

	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	

}
