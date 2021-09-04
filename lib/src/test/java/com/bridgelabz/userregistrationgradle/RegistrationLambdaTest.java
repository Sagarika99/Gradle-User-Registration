package com.bridgelabz.userregistrationgradle;

@FunctionalInterface
interface Registration{
	String validate(String input);
}

public class RegistrationLambdaTest {

	public static void main(String[] args) {
		Registration firstName = input ->{
			String pattern = "^[A-Z][a-z]{3,}";
			if (input.matches(pattern)) {
				return "valid";
			}
			else
				return "invalid";

		};
		
		Registration lastName = input ->{
			String pattern = "^[A-Z][a-z]{3,}";
			if (input.matches(pattern)) {
				return "valid";
			}
			else
				return "invalid";
		};
		
		Registration email = input ->{
			String pattern = "^([a-z0-9]{3,}[\\.-]?[a-z0-9]{3,})@([a-z\\d]{3,})[\\.]?([a-z]{3})$";
			if (input.matches(pattern)) {
				return "valid";
			}
			else
				return "invalid";
		};
		
		Registration phoneNum = input ->{
			String pattern = "[0-9]{2}\\s[0-9]{10}$";
			if (input.matches(pattern)) {
				return"valid";
			}				
			else
				return "invalid";
		};
		
		Registration password = input ->{
			String pattern = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=()]){8,20}.*$";
			if (input.matches(pattern)) {
				return "valid";
			}
			else
				return "invalid";
		};
		
		System.out.println("Validate for Sagarika :" +firstName.validate("Sagarika"));
		System.out.println("Validate for sagarika :" +firstName.validate("sagarika"));
		System.out.println("Validate for Sa :" +firstName.validate("Sa"));
		System.out.println();
		
		System.out.println("Validate for Shinde :" +lastName.validate("Shinde"));
		System.out.println("Validate for shinde :" +lastName.validate("shinde"));
		System.out.println("Validate for Sh :" +lastName.validate("Sh"));
		System.out.println();
		
		System.out.println("Validate for abc123@xyz.com: "+email.validate("abc123@xyz.com"));
		System.out.println("Validate for abc.xyz@pqr.com: "+email.validate("abc.xyz@pqr.com"));
		System.out.println("Validate for abc.xyz.com: "+email.validate("abc.xyz.com"));
		System.out.println("Validate for abc123.cdef@xyz.com: "+email.validate("abc123.cdef@xyz.com"));
		System.out.println("Validate for abc#@.com: "+email.validate("abc#@.com"));
		System.out.println();
		
		System.out.println("Validate for 91 908808121: "+phoneNum.validate("91 908808121"));
		System.out.println("Validate for 9088081211: "+phoneNum.validate("9088081211"));
		System.out.println("Validate for 91 9876543210: "+phoneNum.validate("91 9876543210"));
		System.out.println("Validate for 919876543210: "+phoneNum.validate("919876543210"));
		System.out.println();
		
		System.out.println("Validate for asdaf: "+password.validate("asdaf"));
		System.out.println("Validate for asdafxcZ@123: "+password.validate("asdafxcZ@123"));
		System.out.println("Validate for AsdafxcZ@: "+password.validate("AsdafxcZ@"));
		System.out.println("Validate for asdafxcZ123: "+password.validate("asdafxcZ123"));
	}
}
