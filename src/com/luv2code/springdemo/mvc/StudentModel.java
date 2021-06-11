package com.luv2code.springdemo.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StudentModel {
	
	private String firstName;
	
	private String lastName;
	
	private String country;

	private String favouriteLanguages;
	
	//for listing the country in dropdown
	private HashMap<String, String> countryOption;
	
	//for radiobutton
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	//for checkbox
	private String[] favoriteOS;
	
	public StudentModel() { 
		
		countryOption=new LinkedHashMap<>();
		
		countryOption.put("IN", "INDIA");
		countryOption.put("BR", "BRAZIL");
		countryOption.put("US", "UNITED STATE");
		countryOption.put("PK", "PAKISTAN");
		countryOption.put("UAE", "UNITED STATE OF EMIRATE");
		countryOption.put("USA", "UNITED STATE OF AMERICA");
		
		// populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();
        // parameter order: value, display label
        
        favoriteLanguageOptions.put("Javafile", "Javafile");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");  
		
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

	public HashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public String getFavouriteLanguages() {
		return favouriteLanguages;
	}

	public void setFavouriteLanguages(String favouriteLanguages) {
		this.favouriteLanguages = favouriteLanguages;
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }
	
//	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
//	this.favoriteLanguageOptions = favoriteLanguageOptions;
//}

	public String[] getFavoriteOS() {
		return favoriteOS;
	}

	public void setFavoriteOS(String[] favoriteOS) {
		this.favoriteOS = favoriteOS;
	}

	
	
}
