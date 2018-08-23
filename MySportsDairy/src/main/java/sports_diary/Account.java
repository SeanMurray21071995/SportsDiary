package sports_diary;

public class Account {
	private int accountId;
	private int calendarId;
	private String emailAddress;
	private String username;
	private String password;
	
	public Account() {}
	
	public Account(int accountId, int calendarId,String username,String password,String emailAddress) 
	{
			this.setAccountId(accountId);
			this.setCalendarId(calendarId);
			this.setEmailAddress(emailAddress);;
			this.setUsername(username); 
			this.setPassword(password);
	}
	public void imputResultData(String columnName, Object input) 
	{
		switch(columnName){
		case "idAccount":
			this.setAccountId((int)input);
			break;
		case "emailAddress":
			this.setEmailAddress((String)input);
			break;
		case "calendarId":
			this.setCalendarId((int)input);
			break;
		case "password":
			this.setPassword((String)input);
			break;
		case "username":
			this.setUsername((String)input);
			break;
		}
	}
	public int getAccountId() {
		return accountId;
	}
	public int getCalendarId() {
		return calendarId;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getUsername() {
		return username;
	} 
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public void setCalendarId(int calendarId) {
		this.calendarId = calendarId;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress= emailAddress;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
