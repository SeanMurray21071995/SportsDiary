package testSportsDiary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sportsDiary.JavaDataBaseConnector;

public class TestJavaDataBaseConnector {
	
	private JavaDataBaseConnector jdbc;
	@Before
	public void testConnect() 
	{
		this.jdbc=new JavaDataBaseConnector();
		jdbc.create("INSERT INTO customer (firstName,lastName,mobileNumber,emailAddress) VALUES ('test','test',1000,'test@test.com');");
	}
	@Test
	public void testCreat() 
	{
		assertNotNull("the entry wasn't their",jdbc.read("SELECT firstName From customer WHERE firstName='test';"));
	} 
	@Test
	public void testRead() 
	{
		JavaDataBaseConnector jdbc = new JavaDataBaseConnector();
		assertNotNull("didnt return the corect info from the database", jdbc.read("SELECT firstName From customer WHERE firstName='test';"));
	}
	@Test
	public void testUpdate()
    {
		jdbc.update("UPDATE customer SET firstName='tes' WHERE firstName='test'");
		assertNotNull("didn't get the data that was needed to be retrived", jdbc.read("SELECT * FROM customer WHERE firstName='tes';"));
		jdbc.delete("DELETE FROM customer WHERE firstName ='tes'");
	}
	@After 
	public void testDelete() 
	{
		jdbc.delete("DELETE FROM customer WHERE firstName ='test'");
		System.out.println(jdbc.read("SELECT *FROM customer;"));
		//assertNull("The entry wasn't deleted", jdbc.read("SELECT *FROM customer;"));
 
	}


}
