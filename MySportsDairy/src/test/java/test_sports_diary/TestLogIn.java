package test_sports_diary;
import org.junit.Before;
import org.junit.Test;

import sports_diary.JavaDataBaseConnector;
import sports_diary.LogIn;
import sports_diary.SignUp;

public class TestLogIn {
	@Before
	public void setup() 
	{
		SignUp su = new SignUp();
		su.signUpInsertCustomer("tes", "test", "0123456", "testest@test.com");
		su.SignUpAccountInsert("tessie","password","testest@test.com");
	}
	
	@Test
	public void logIn() 
	{
		LogIn li = new LogIn();
		li.processData("tessie", "password");
		
	}
}
