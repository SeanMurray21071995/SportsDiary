package sports_diary;

public class Customer {
	private String emailAddress;
	private String firstName;
	private String lastName;
	private String mobileNumber;

	public Customer() {}
	
	public Customer( String emailAddress,String firstName, String lastName, String mobileNumber) 
	{ 
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMobileNumber(mobileNumber);
		this.setEmailAddress(emailAddress);
	}
	public void imputResultData(String columnName, Object input) 
	{
		switch(columnName){
		case "firstName": 
			this.setFirstName((String)input);
			break;
		case "lastName":
			this.setLastName((String)input);
			break;
		case "mobileNumber":
			this.setMobileNumber((String)input);
			break;
		case "emailAddress":
			this.setEmailAddress((String)input);
			break;
		}
	}	
	

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMobileNumber(String input) {
		this.mobileNumber = input;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
