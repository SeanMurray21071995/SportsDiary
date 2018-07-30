package testSportsDiary;

import static org.junit.Assert.*;

import org.junit.Test;

import sportsDiary.JavaDataBaseConnector;

public class TestJavaDataBaseConnector {
	
	@Test
	public void testConnect() 
	{
		JavaDataBaseConnector jdbc= new JavaDataBaseConnector();
		jdbc.connect(); 
	}
	@Test
	public void testCreat() 
	{
		
	}
	@Test
	public void testRead() 
	{
		JavaDataBaseConnector jdbc = new JavaDataBaseConnector();
		assertNotNull("didnt return the corect info from the database", jdbc.read("SELECT firstName From Customer WHERE firstName='test'"));
	}

}
