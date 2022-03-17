package com.madhu.project;

public class Model {
	
	private String name;
	private String email;
	private String password;
	
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserDetail: [Registered User=" +name + " "+ "Registered email=" +email + " " +"Password for the registration=" +password +"]";
	}
	 



}
