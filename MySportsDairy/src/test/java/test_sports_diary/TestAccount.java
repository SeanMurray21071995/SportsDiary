package test_sports_diary;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sports_diary.Account;

public class TestAccount {
	Account a;
	@Before
	public void testAccount() 
	{
		a = new Account(1,2,"password","username","email@email");
	}
	@Test
	public void testAccountIdGet() 
	{
		assertEquals("didn't get Id",a.getAccountId(),1);
	}
	@Test 
	public void testCalanderIdGet() 
	{
		assertEquals("didn't get calander Id",a.getCalendarId(),2);
	}
	@Test
	public void testEmailGet() 
	{
		assertEquals("didn't get customer Id",a.getEmailAddress(),"email@email");
	}
	@Test
	public void testPasswordGet() 
	{
		assertEquals("didn't get password",a.getPassword(),"password");
	}
	@Test
	public void testUsernameGet() 
	{
		assertEquals("didn't get username",a.getUsername(),"username");
	}
	@Test
	public void testImputResultData() 
	{
		a.imputResultData("emailAddress","email@email");
		assertEquals("didn't work",a.getEmailAddress(),"email@email");
	}
}
