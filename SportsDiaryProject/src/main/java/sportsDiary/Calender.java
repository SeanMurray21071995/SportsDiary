package sportsDiary;

public class Calender {

	private int calenderId;
	private int AccountId;
	
	public Calender(int accountId) 
	{
		this.setAccountId(accountId);
	}
	public int getCalenderId() {
		return calenderId;
	}
	public int getAccountId() {
		return AccountId;
	}

	public void setCalenderId(int calenderId) {
		this.calenderId = calenderId;
	}
	public void setAccountId(int accountId) {
		AccountId = accountId;
	}
	
}
