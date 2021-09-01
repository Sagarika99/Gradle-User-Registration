package com.bridgelabz.userregistrationgradle;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

	public static final String Name_Pattern = "^[A-Z][a-z]{3,}";
	public static final String Email_ID = "^([a-z0-9]{3,}[\\.-]?[a-z0-9]{3,})@([a-z\\d]{3,})[\\.]?([a-z]{3})$";
	public static final String Phone_Num = "^[0-9]{2}\\s[0-9]{10}$";
	public static final String Password = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=()]){8,20}.*$";
	
	public String FirstName(String fname) throws UserRegistrationException {
		Pattern pattern = Pattern.compile(Name_Pattern);
		try {
			if(fname.length()<=0) {
				throw new UserRegistrationException("First Name cannot be empty");
			}
			if (pattern.matcher(fname).matches()) {
				return "First Name is Valid";
			}
			return "Invalid First Name";
		}
		catch(NullPointerException e) {
			throw new UserRegistrationException("First name cannot be null");
		}
	}
	
	public String LastName(String lname) throws UserRegistrationException{
		Pattern pattern = Pattern.compile(Name_Pattern);
		try {
			if(lname.length()<=0) {
				throw new UserRegistrationException("Last Name cannot be empty");
			}
			if (pattern.matcher(lname).matches()) {
				return "Last Name is Valid";
			}
			return "Invalid Last Name";
		}
		catch(NullPointerException e) {
			throw new UserRegistrationException("Last name cannot be null");
		}
	}
	
	public String EmailId(String email) throws UserRegistrationException{
		Pattern pattern = Pattern.compile(Email_ID);
		try {
			if(email.length()<=0) {
				throw new UserRegistrationException("Email cannot be empty");
			}
			if (pattern.matcher(email).matches()) {
				return "Email is Valid";
			}
			return "Invalid Email";
		}
		catch(NullPointerException e) {
			throw new UserRegistrationException("Email cannot be null");
		}
	}
	
	public String PhoneNum(String phoneNum) throws UserRegistrationException{
		Pattern pattern = Pattern.compile(Phone_Num);
		try {
			if(phoneNum.length()<=0) {
				throw new UserRegistrationException("Phone Number cannot be empty");
			}
			if (pattern.matcher(phoneNum).matches()) {
				return "Phone Number is Valid";
			}
			return "Invalid Phone Number";
		}
		catch(NullPointerException e) {
			throw new UserRegistrationException("Phone Number cannot be null");
		}
	}
	
	public String Password(String password) throws UserRegistrationException{
		Pattern pattern = Pattern.compile(Password);
		try {
			if(password.length()<=0) {
				throw new UserRegistrationException("Password cannot be empty");
			}
			if (pattern.matcher(password).matches()) {
				return "Password is Valid";
			}
			return "Invalid Password";
		}
		catch(NullPointerException e) {
			throw new UserRegistrationException("Password cannot be null");
		}
	}
}
