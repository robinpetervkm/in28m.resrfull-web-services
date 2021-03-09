package com.in28minutes.rest.webservices.restfullwebservices.versioning;

public class Name {
	private String fristName;
	private String lastName;
	
	
	
	public Name() {
		super();
	}


	public Name(String fristName, String lastName) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
	}


	public String getFristName() {
		return fristName;
	}


	public void setFristName(String fristName) {
		this.fristName = fristName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
