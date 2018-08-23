package test_sports_diary;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sports_diary.Customer;
public class TestCustomer {
	Customer c ;
	@Before
	public void create()
	{
		c=new Customer( "Tes", "Test", "077100000", "Test@Test.com");
	}
	@Test
	public void testCustomerFirstNameGet() 
	{	
		assertEquals("Didn't retrieve the customer first name", c.getFirstName(), "Tes");
	}
	@Test
	public void testCustomerSecondNameGet() 
	{
		assertEquals("Didn't retrieve the customer last name", c.getLastName(), "Test");
	}
	@Test
	public void testCustomerMobileNumberGet() 
	{
		assertEquals("Didn't retrieve the customer mobile number", c.getMobileNumber(), 077100000);
	}
	@Test
	public void testCustomerEmailAddressGet() 
	{
		assertEquals("Didn't retrieve the customer email address", c.getEmailAddress(),"Test@Test.com");
	}

}
