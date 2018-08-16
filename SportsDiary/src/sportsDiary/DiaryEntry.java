package sportsDiary;

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
		jsob.put(key, statment);
		return jsob;
	}
}
 