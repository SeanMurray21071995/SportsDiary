package sportsDiary;

import java.sql.ResultSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SignUp {
	private String passwordFirstEntry;
	private int mobileNumber;
	private String emailAddress;
	
	
	public void signUpInsertCustomer(String firstName, String lastName, int mobileNumber, String email)
	{
		this.mobileNumber=mobileNumber;
		this.emailAddress = email;
		JavaDataBaseConnector jdbc= new JavaDataBaseConnector();
		jdbc.create("INSERT INTO customer (firstName,lastName,mobileNumber,emailAddress) VALUES ('"+firstName+"','"+lastName+"',"+mobileNumber+",'"+email+"');");
		
	}
	public void SignUpAccountInsert(String username, String passwordFirstEntry, String passwordSecondEntry)
	{
		if(passwordFirstEntry.equals(passwordSecondEntry))
		{
			JavaDataBaseConnector jdbc1 = new JavaDataBaseConnector();
			ResultSet rs = jdbc1.read("SELECT customerId From customer WHERE firstName="+mobileNumber+"AND emailAddress='"+emailAddress+"';");
			
			JavaDataBaseConnector jdbc2= new JavaDataBaseConnector();
			jdbc2.create("INSERT INTO account (username,password) VALUES ('"+username+"','"+passwordFirstEntry+"')");
		}
		else
		{
			
		}
	}
}
