package com.bridgelabz.userregistrationgradle;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

	public static final String Name_Pattern = "^[A-Z a-z]{3,}";
	
	public boolean FirstName(String fname) {
		Pattern pattern = Pattern.compile(fname);
		return pattern.matcher(fname).matches();
	}
	
	public boolean LastName(String lname) {
		Pattern pattern = Pattern.compile(lname);
		return pattern.matcher(lname).matches();
	}
}
