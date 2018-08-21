package testSportsDiary;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import sportsDiary.DiaryEntry;

public class TestDiaryEntry {
	DiaryEntry de;
	@Before
	public void createDiaryEntry() 
	{
		de=new DiaryEntry();
		de.setDiaryEntryId(1);
		de.setSatement("test");
	}
	@Test
	public void testDiaryEntryGetId() 
	{
		de.setDiaryEntryId(1);
		assertEquals("didn't get id",de.getDiaryEntryId() ,1);
	}
	@Test
	public void testDiaryEntry() 
	{
		de.setSatement("test");
		assertEquals("didn't get statement",de.getSatement(), "test");
	}
	@Test
	public void testToJSONObject() 
	{
		JSONObject j = de.toJSONObject();
		try {
			assertNotNull("return null",j.get("1"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
