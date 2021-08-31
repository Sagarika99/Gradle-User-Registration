package com.bridgelabz.userregistrationgradle;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationRunner {
	
	//first name
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.FirstName("Sagarika");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.FirstName("Sa");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.FirstName("S@garika");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenWithoutCaps_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.FirstName("sagarika");
		Assert.assertEquals(false, result);
	}
	
	//last name
	@Test
	public void givenLastName_whenProper_shouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.LastName("Shinde");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.LastName("Sh");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.LastName("Shi$nde");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenWithoutCaps_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.LastName("shinde");
		Assert.assertEquals(false, result);
	}
	
	//email id
	@Test
	public void givenEmailID_whenProper_shouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.EmailId("sagarika.shinde@yahoo.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenEmailID_whenShortbutProper_shouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.EmailId("sagarika@yahoo.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenEmailID_WhenEmailWithNumber_ShouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.EmailId("sagarika99@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenEmailID_WhenTldStartsWithDot_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.EmailId("sagarika@.com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailStartsWithDot_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.EmailId(".sagarika@.com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailHasdoubleSymbol_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.EmailId("sagarika@shinde@.com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailTldHasdigit_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.EmailId("sagarika@gmail.1om");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmailID_WhenEmailCannotHaveMultipleTlds_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.EmailId("sagarika@gmail.com.com.in");
		Assert.assertEquals(false, result);
	}
	
	//mobile number
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.PhoneNum("91 7506385338");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenMobileNumber_WhenWithNoSpace_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.PhoneNum("917506385338");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_WhenLessThanTenDigits_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.PhoneNum("91 75063838");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_WhenWithNoCountryCode_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.PhoneNum("7506385338");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNumber_WhenMoreThanTenDigits_ShouldReturnFalse() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.PhoneNum("91 750638533889");
		Assert.assertEquals(false, result);
	}
}
