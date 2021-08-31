package com.bridgelabz.userregistrationgradle;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

	public static final String Name_Pattern = "^[A-Z][a-z]{3,}";
	public static final String Email_ID = "^([a-z0-9]{3,}[\\.-]?[a-z0-9]{3,})@([a-z\\d]{3,})[\\.]?([a-z]{3})$";
	public static final String Phone_Num = "^[0-9]{2}\\s[0-9]{10}$";
	public static final String Password = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=()]){8,20}.*$";
	
	public boolean FirstName(String fname) {
		Pattern pattern = Pattern.compile(Name_Pattern);
		return pattern.matcher(fname).matches();
	}
	
	public boolean LastName(String lname) {
		Pattern pattern = Pattern.compile(Name_Pattern);
		return pattern.matcher(lname).matches();
	}
	
	public boolean EmailId(String email) {
		Pattern pattern = Pattern.compile(Email_ID);
		return pattern.matcher(email).matches();
	}
	
	public boolean PhoneNum(String phoneNum) {
		Pattern pattern = Pattern.compile(Phone_Num);
		return pattern.matcher(phoneNum).matches();
	}
	
	public boolean Password(String password) {
		Pattern pattern = Pattern.compile(Password);
		return pattern.matcher(password).matches();
	}
}
