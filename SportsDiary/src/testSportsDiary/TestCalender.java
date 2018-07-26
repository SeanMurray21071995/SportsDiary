package testSportsDiary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sportsDiary.Calender;

public class TestCalender {
	Calender c;
	@Before
	public void createCalender()
	{
		 c = new Calender(1);
	}
	@Test
	public void testCalenderIdGet()
	{
		c.setCalenderId(2);
		assertEquals("didn't get calender Id",c.getCalenderId(), 2);
	}
	@Test
	public void testAccountId() 
	{
		assertEquals("didn't get the accoutn id",c.getAccountId(),1);
	}
}
