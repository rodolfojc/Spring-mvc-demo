package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
		
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public Student() {
		
		//POPULATE DATA - COUNTRY ISO COUNTRY CODE
		this.countryOptions = new LinkedHashMap<>();
		
		                       //KEY  //VALUE
		this.countryOptions.put("VE", "Venezuela");
		this.countryOptions.put("FR", "France");
		this.countryOptions.put("DE", "Germany");
		this.countryOptions.put("IN", "India");
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
		
}
