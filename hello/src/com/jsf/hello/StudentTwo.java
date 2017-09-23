package com.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] language;
	

	
	public StudentTwo() {
		firstName="kalika";
		lastName="Vats";
		
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
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getLanguage() {
		return language;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}
	
	

	
	
}

