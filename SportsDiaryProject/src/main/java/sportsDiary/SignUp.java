package sportsDiary;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public void SignUpAccountInsert(String username, String password)
	{
			this.jdbc= new JavaDataBaseConnector();
			ArrayList<Object> results = jdbc.read("SELECT idCustomer From customer WHERE emailAddress='"+emailAddress+"';","customer");
			if(results.size()>1){
				//TODO create a method that handles what would happen if there is more that one itream in the result set.
				//jdbc.delete("DELETE FROM customer WHERE idCustomer="+this.customerId+";");
			}
			else {
				Customer tmp = (Customer)results.get(0);
				this.customerId=tmp.getCustomerId();
				this.jdbc= new JavaDataBaseConnector();
				jdbc.create("INSERT INTO account (username,password,idCustomer,idCalender) VALUES ('"+username+"','"+password+"',"+this.customerId+","+1+")");
			}
		}	
	}

