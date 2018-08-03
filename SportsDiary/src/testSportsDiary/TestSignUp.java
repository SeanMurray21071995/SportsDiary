package testSportsDiary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sportsDiary.JavaDataBaseConnector;
import sportsDiary.SignUp;

public class TestSignUp {

	private JavaDataBaseConnector jdbc;
	private SignUp su;
	@Before
	public void onStart() 
	{
		this.jdbc= new JavaDataBaseConnector();
		this.su= new SignUp();
		su.signUpInsertCustomer("test", "test", 123456, "test@test.com");
	}
	@Test 
	public void testSignUpInsertCustomer() 
	{
		assertNotNull("didm't insert",jdbc.read("SELECT * FROM customer WHERE firstName ='test'"));
	}
	@Test void testSingUpAccountInser() 
	{
		this.jdbc=new JavaDataBaseConnector();
	}
	@After 
	public void onCompletion() 
	{
		JavaDataBaseConnector jdbc = new JavaDataBaseConnector();
		jdbc.delete("DELETE FROM customer WHERE firstName ='test'");
	}
}
