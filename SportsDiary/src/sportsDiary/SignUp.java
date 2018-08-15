package sportsDiary;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class SignUp {
	private String emailAddress; 
	private int customerId;
	private JavaDataBaseConnector jdbc;
	public void signUpInsertCustomer(String firstName, String lastName, int mobileNumber, String email)
	{
		this.emailAddress = email;
		this.jdbc= new JavaDataBaseConnector();
		jdbc.create("INSERT INTO customer (firstName,lastName,mobileNumber,emailAddress) VALUES ('"+firstName+"','"+lastName+"',"+mobileNumber+",'"+email+"');");
		
	}
	public void SignUpAccountInsert(String username, String passwordFirstEntry, String passwordSecondEntry)
	{
		if(passwordFirstEntry.equals(passwordSecondEntry))
		{
			this.jdbc= new JavaDataBaseConnector();
			ResultSet rs = jdbc.read("SELECT idCustomer From customer WHERE emailAddress='"+emailAddress+"';");
			try {
				while(rs.next()) 
				{
					this.customerId = rs.getInt(0);
					this.jdbc= new JavaDataBaseConnector();
					jdbc.create("INSERT INTO account (username,password,idCustomer) VALUES ('"+username+"','"+passwordFirstEntry+"',"+this.customerId+")");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
				// maybe create a better exception to handle what would happen if try failed 
			}
		}
		else
		{ 
			this.jdbc= new JavaDataBaseConnector();
			jdbc.delete("DELETE FROM customer WHERE idCustomer="+this.customerId+";");
			//TODO create a method that handles what would happen if the passwords do not match. 
		}
	}
}
