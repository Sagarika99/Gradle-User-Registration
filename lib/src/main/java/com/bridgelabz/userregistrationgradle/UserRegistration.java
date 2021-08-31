package com.bridgelabz.userregistrationgradle;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

	public static final String Name_Pattern = "^[A-Z][a-z]{3,}";
	public static final String Email_ID = "^([a-z0-9]{3,}[\\.-]?[a-z0-9]{3,})@([a-z\\d]{3,})[\\.]?([a-z]{3})$";
	
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
}
