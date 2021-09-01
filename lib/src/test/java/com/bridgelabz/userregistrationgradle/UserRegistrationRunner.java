package com.bridgelabz.userregistrationgradle;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationRunner {
	
	//first name
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.FirstName("Sagarika");
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals("First Name is Valid", e.getMessage());
		}
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.FirstName("Sa");
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals("Invalid First Name", e.getMessage());
		}
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.FirstName("S@garika");
		}
		catch(UserRegistrationException e){
			Assert.assertEquals("Invalid First Name", e.getMessage());
		}
	}
	
	@Test
	public void givenFirstName_WhenWithoutCaps_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.FirstName("sagarika");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid First Name", e.getMessage());
		}
	}
	
	public void givenFirstName_WhenNull_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.FirstName(null);
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("First name cannot be null", e.getMessage());
		}
	}
	
	public void givenFirstName_WhenEmpty_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.FirstName("");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("First name cannot be empty", e.getMessage());
		}
	}
	
	//last name
	@Test
	public void givenLastName_whenProper_shouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.LastName("Shinde");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Last Name is Valid", e.getMessage());
		}		
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.LastName("Sh");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid Last Name", e.getMessage());
		}
	}
	
	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.LastName("Shi$nde");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid Last Name", e.getMessage());
		}
	}
	
	@Test
	public void givenLastName_WhenWithoutCaps_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.LastName("shinde");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid Last Name", e.getMessage());
		}
	}
	
	public void givenLastName_WhenNull_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.LastName(null);
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Last name cannot be null", e.getMessage());
		}
	}
	
	public void givenLastName_WhenEmpty_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.LastName("");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Last name cannot be empty", e.getMessage());
		}
	}
	
	//email id
	@Test
	public void givenEmailID_whenProper_shouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId("sagarika.shinde@yahoo.com");
		}
		catch (UserRegistrationException e) {
			Assert.assertEquals("Email is Valid", e.getMessage());
		}
	}
	
	@Test
	public void givenEmailID_whenShortbutProper_shouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId("sagarika@yahoo.com");
		}
		catch (UserRegistrationException e) {
			Assert.assertEquals("Email is Valid", e.getMessage());
		}
	}
	
	@Test
	public void givenEmailID_WhenEmailWithNumber_ShouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId("sagarika99@gmail.com");
		}
		catch (UserRegistrationException e) {
			Assert.assertEquals("Email is Valid", e.getMessage());
		}
	}
	
	@Test
	public void givenEmailID_WhenTldStartsWithDot_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId("sagarika@.com");
		}
		catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid Email", e.getMessage());
		}
	}
	
	@Test
	public void givenEmailID_WhenEmailStartsWithDot_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId(".sagarika@.com");
		}
		catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid Email", e.getMessage());
		}
	}
	
	@Test
	public void givenEmailID_WhenEmailHasdoubleSymbol_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId("sagarika@shinde@.com");
		}
		catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid Email", e.getMessage());
		}
	}
	
	@Test
	public void givenEmailID_WhenEmailTldHasdigit_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId("sagarika@gmail.1om");
		}
		catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid Email", e.getMessage());
		}
	}
	
	@Test
	public void givenEmailID_WhenEmailCannotHaveMultipleTlds_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId("sagarika@gmail.com.com.in");
		}
		catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid Email", e.getMessage());
		}
	}
	
	public void givenEmailId_WhenNull_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId(null);
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Email cannot be null", e.getMessage());
		}
	}
	
	public void givenEmailId_WhenEmpty_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.EmailId("");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Email cannot be empty", e.getMessage());
		}
	}
	
	//mobile number
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.PhoneNum("91 7506385338");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Phone Number is Valid", e.getMessage());
		}
	}
	
	@Test
	public void givenMobileNumber_WhenWithNoSpace_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.PhoneNum("917506385338");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid Phone Number", e.getMessage());
		}
	}
	
	@Test
	public void givenMobileNumber_WhenLessThanTenDigits_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.PhoneNum("91 75063838");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid Phone Number", e.getMessage());
		}
	}
	
	@Test
	public void givenMobileNumber_WhenWithNoCountryCode_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.PhoneNum("7506385338");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid Phone Number", e.getMessage());
		}
	}
	
	@Test
	public void givenMobileNumber_WhenMoreThanTenDigits_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.PhoneNum("91 750638533889");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid Phone Number", e.getMessage());
		}
	}
	
	public void givenMobileNumber_WhenNull_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.PhoneNum(null);
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Phone Number cannot be null", e.getMessage());
		}
	}
	
	public void givenMobileNumber_WhenEmpty_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.PhoneNum("");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Phone Number cannot be empty", e.getMessage());
		}
	}
	
	//Password
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.Password("Sagarika@56");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Password is Valid", e.getMessage());
		}
	}
	
	@Test
	public void givenPassword_WhenWithNoCaps_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.Password("sagarika@33");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Password is Valid", e.getMessage());	
		}
	}
	
	@Test
	public void givenPassword_WhenWithNoSymbol_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.Password("Sagarika23");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid Password", e.getMessage());
		}
	}
	
	@Test
	public void givenPassword_WhenWithLessThanEightLength_ShouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.Password("Saga%12");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Invalid Password", e.getMessage());
		}
	}
	
	public void givenPassword_WhenNull_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.Password(null);
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Password cannot be null", e.getMessage());
		}
	}
	
	public void givenPassword_WhenEmpty_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		try {
			String result = registration.Password("");
		}
		catch (UserRegistrationException e){
			Assert.assertEquals("Password cannot be empty", e.getMessage());
		}
	}
	
}


