package sportsDiary;

import java.util.ArrayList;

public class LogIn {
	private JavaDataBaseConnector jdbc;
	private String username;
	private String password;
	
	public boolean processData(String username, String password)
	{
		if(this.getAccount().getAccountId()==-1) 
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	private Account getAccount() 
	{
		this.jdbc=new JavaDataBaseConnector();
		ArrayList<Object> id = jdbc.read("SELECT idAccount FROM account WHERE username ='"+username+"' AND password ='"+password+"';", "account");
		Account tmp = (Account)id.get(0);
		return tmp;
	}
}
