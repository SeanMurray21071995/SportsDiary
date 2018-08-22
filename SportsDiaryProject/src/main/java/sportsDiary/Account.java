package sportsDiary;

import java.sql.ResultSetMetaData;
 
public class Account {
	
	private int accountId;
	private int calenderId;
	private int customerId;
	private String username;
	private String password;
	
	public Account(int accountId, int calanderId,int customerId,String password,String username) 
	{
			this.setAccountId(accountId);
			this.setCalenderId(calanderId);
			this.setCustomerId(customerId);
			this.setPassword(password);
			this.setUsername(username); 
	}
	public void imputResultData(String columnName, Object input) 
	{
		switch(columnName){
		case "idAccount":
			this.setAccountId((int)input);
			break;
		case "idCustomer":
			this.setCustomerId((int)input);
			break;
		case "idCalender":
			this.setCalenderId((int)input);
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
	public int getCalenderId() {
		return calenderId;
	}
	public int getCustomerId() {
		return customerId;
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
	public void setCalenderId(int calenderId) {
		this.calenderId = calenderId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
