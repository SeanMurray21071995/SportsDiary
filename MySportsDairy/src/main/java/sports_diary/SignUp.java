package sports_diary;
public class SignUp {
	private JavaDataBaseConnector jdbc;
	public void signUpInsertCustomer(String firstName, String lastName, String mobileNumber, String email)
	{
		this.jdbc= new JavaDataBaseConnector();
		jdbc.create("INSERT INTO customer (firstName,lastName,mobileNumber,emailAddress) VALUES ('"+firstName+"','"+lastName+"',"+mobileNumber+",'"+email+"');");
		
	}
	public void SignUpAccountInsert(String username, String password, String emailAddress)
	{
			this.jdbc= new JavaDataBaseConnector();
			this.jdbc= new JavaDataBaseConnector();
			jdbc.create("INSERT INTO account (username,password,emailAddress,idCalender) VALUES ('"+username+"','"+password+"','"+emailAddress+"',"+1+")");
		}	
}
