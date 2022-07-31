package ExceptionHandling;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class UserRegisterTest {
	private UserRegister userRegister;

	@Test
	public void firstnameTest() {
		try {
			UserRegister user = new UserRegister();
			boolean result = user.firstname();
			Assert.assertEquals(true, result);

		} 
		catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}	
	
	@Test
	public void lastnameTest() {
		try {
			UserRegister user = new UserRegister();
			boolean result = user.lastname();
			Assert.assertEquals(true, result);

		} 
		catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}	
	
	@Test
	public void mobileTest() {
		try {
			UserRegister user = new UserRegister();
			boolean result = user.mobile();
			Assert.assertEquals(true, result);

		} 
		catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}	
	
	@Test
	public void emailTest() {
		try {
			UserRegister user = new UserRegister();
			boolean result = user.email();
			Assert.assertEquals(true, result);

		} 
		catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}	
	
	@Test
	public void passwordTest() {
		try {
			UserRegister user = new UserRegister();
			boolean result = user.password();
			Assert.assertEquals(true, result);

		} 
		catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}	
}
