package testSportsDiary;

import org.junit.Before;
import org.junit.Test;

import sportsDiary.Account;
import sportsDiary.JavaDataBaseConnector;
import sportsDiary.LogIn;
import sportsDiary.SignUp;

public class TestLogIn {
	
	@Before
	public void setup() 
	{
		JavaDataBaseConnector jdbc = new JavaDataBaseConnector();
		SignUp su = new SignUp();
		su.signUpInsertCustomer("tes", "test", 0123456, "testest@test.com");
		su.SignUpAccountInsert("tessie","password");
	}
	
	@Test
	public void logIn() 
	{
		LogIn li = new LogIn();
		li.processData("tessie", "password");
		
	}

}
