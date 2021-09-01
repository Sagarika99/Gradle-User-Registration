package com.bridgelabz.userregistrationgradle;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Before;

@RunWith(Parameterized.class)
public class EmailRunner {

	private String emailId;
	private boolean expectedResult;
	private UserRegistration registration;
	
	public EmailRunner(String emailId, boolean expectedResult) {
		this.emailId = emailId;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void initialize() {
		registration = new UserRegistration();
	}
	
	@Parameterized.Parameters
	public static Collection validateEmails() {
		return Arrays.asList(new Object[][]{
			{"abcdef@yahoo.com",true},
			{"abc-xyz@gmail.com",true},
			{"abc.xyz@gmail.com",true},
			{"abc12345@gmail.com",true},
			{"abc-989@gmail.com",true},
			{"abc.989@gmail.com",true},
			{"abc@xyz@gmail.com",false},
			{"abc.+989@gmail.com",false},
			{"abc",false},
			{".abc.com",false},
			{"abcdefg@12.com",false},
			{"abc.2334@com",false},
			{"abc@xyz.in.com",false},
			{"abc@xyz.com.1x",false},			
		});
	}
	
	@Test
	public void givenEmailId_ShouldReturnProperResult() throws UserRegistrationException {
		System.out.println("Email " +emailId+ " is valid: " +expectedResult);
		Assert.assertEquals(expectedResult, registration.EmailId(emailId));
	}
}
