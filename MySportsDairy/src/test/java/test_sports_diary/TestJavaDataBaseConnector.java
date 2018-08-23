package test_sports_diary;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sports_diary.Customer;
import sports_diary.JavaDataBaseConnector;

public class TestJavaDataBaseConnector {
	private JavaDataBaseConnector jdbc;
	@Before
	public void testConnect() 
	{
		this.jdbc=new JavaDataBaseConnector();
		jdbc.create("INSERT INTO customer (firstName,lastName,mobileNumber,emailAddress) VALUES ('testFirst','testLast',1000,'test@test.com');");
	}
	@Test
	public void testRead() 
	{ 
		ArrayList<Object> result = jdbc.read("SELECT firstName From customer WHERE firstName='testFirst';","customer");
		Customer ob = (Customer)result.get(0);
		assertEquals("didnt return the corect info from the database",ob.getFirstName(),"testFirst" );
	}
	@Test
	public void testUpdate()
    {
		jdbc.update("UPDATE customer SET firstName='tes' WHERE firstName='testFirst'");
		assertNotNull("didn't get the data that was needed to be retrived", jdbc.read("SELECT * FROM customer WHERE firstName='tes';","customer"));
		jdbc.delete("DELETE FROM customer WHERE firstName ='tes'");
	}
	@After 
	public void testDelete() 
	{
		jdbc.delete("DELETE FROM customer WHERE firstName ='testFirst'");
		//System.out.println(jdbc.read("SELECT *FROM customer;", "customer"));
		//assertNull("The entry wasn't deleted", jdbc.read("SELECT *FROM customer;"));
 
	}

}
