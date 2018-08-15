package testSportsDiary;

import static org.junit.Assert.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sportsDiary.JavaDataBaseConnector;
import sportsDiary.SignUp;

public class TestSignUp {
	private ResultSet rs;
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
	@Test 
	public void testSingUpAccountInsert() 
	{
		String username=null;
		this.su.SignUpAccountInsert("test123", "password", "password");
		rs = jdbc.read("SELECT * FROM account WHERE username = test123");
		try {
			username = rs.getString(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertNotNull("didn't return anything", username);
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
