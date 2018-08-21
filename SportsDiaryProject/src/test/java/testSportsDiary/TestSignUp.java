package testSportsDiary;

import static org.junit.Assert.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sportsDiary.Account;
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
		
		assertNotNull("didm't insert",jdbc.read("SELECT * FROM customer WHERE firstName ='test'", "customer"));
	}
	@Test 
	public void testSingUpAccountInsert() 
	{
		String username=null;
		this.su.SignUpAccountInsert("test123", "password", "password");
		ArrayList<Object> tmp = jdbc.read("SELECT * FROM account WHERE username = 'test123'", "account");
		Account acc = (Account)tmp.get(0);
		username = acc.getUsername() ;
		System.out.println(username);
		assertNotNull("didn't return anything", username);
	}
	@Test
	public void testPasswordsAreNotTheSame() 
	{
		
	}
	@After 
	public void onCompletion() 
	{
		this.jdbc = new JavaDataBaseConnector();
		jdbc.delete("DELETE FROM customer WHERE firstName ='test'");
		this.jdbc = new JavaDataBaseConnector();
		jdbc.delete("DELETE FROM account WHERE username = 'test123'");
	}
}
 