package test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.Assignment10_LoginPage;

public class Assignment10_loginValidation extends Assignment10_Base {

	String username ="abcd@gmail.com";
	 String password = "Password123";
	//@Parameters({ "Validuser", "Validpass" })
	@Test
	public void LoginFunctionality(String username, String password) throws IOException 
	{

		Assignment10_LoginPage obj = new Assignment10_LoginPage(driver);
		obj.loginWithCredentials(username, password);

	}
}
