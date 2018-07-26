package testSportsDiary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sportsDiary.DiaryEntry;

public class TestDiaryEntry {
	DiaryEntry De;
	@Before
	public void createDiaryEntry() 
	{
		De=new DiaryEntry();
	}
	@Test
	public void testDiaryEntryGetId() 
	{
		De.setDiaryEntryId(1);
		assertEquals("didn't get id",De.getDiaryEntryId() ,1);
	}

}
