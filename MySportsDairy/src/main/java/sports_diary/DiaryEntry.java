package sports_diary;

import org.json.JSONException;
import org.json.JSONObject;

public class DiaryEntry {
	private int DiaryEntryId;
	private String statment;
	public DiaryEntry() 
	{
		 
	}
	public int getDiaryEntryId() {
		return DiaryEntryId;
	}
	public void setDiaryEntryId(int diaryEntryId) {
		DiaryEntryId = diaryEntryId;
	}
	public String getSatement() {
		return statment;
	}
	public void setSatement(String satement) {
		this.statment = satement;
	}
	public JSONObject toJSONObject() 
	{
		JSONObject jsob = new JSONObject();
		String key = Integer.toString(DiaryEntryId);
		try {
			jsob.put(key, statment);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsob;
	}
}
