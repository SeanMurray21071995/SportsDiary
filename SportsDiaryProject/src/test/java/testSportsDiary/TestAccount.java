package testSportsDiary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sportsDiary.Account;

public class TestAccount {
	Account a;
	@Before
	public void testAccount() 
	{
		a = new Account(1,2,3,"password","username");
	}
	@Test
	public void testAccountIdGet() 
	{
		assertEquals("didn't get Id",a.getAccountId(),1);
	}
	@Test 
	public void testCalanderIdGet() 
	{
		assertEquals("didn't get calander Id",a.getCalenderId(),2);
	}
	@Test
	public void testCustomerIdGet() 
	{
		assertEquals("didn't get customer Id",a.getCustomerId(),3);
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
		a.imputResultData("idCustomer",1);
		assertEquals("didn't work",a.getCustomerId(),1);
	}
}
