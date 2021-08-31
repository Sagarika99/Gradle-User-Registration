package com.bridgelabz.userregistrationgradle;

import org.junit.Test;
import org.junit.Assert;


public class UserRegistrationRunner {

	@Test
	public void givenFirstName_whenProper_shouldReturnTrue() {
		UserRegistration registration = new UserRegistration();
		boolean result = registration.FirstName("Sagarika");
		Assert.assertEquals(true,result);
	}
}
