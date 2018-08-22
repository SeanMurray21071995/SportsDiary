package sportsDiary;

public class Customer {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private int mobileNumber;
	private String emailAddress;
	
	public Customer(int customerId,String firstName, String lastName, int mobileNumber, String emailAddress) 
	{ 
		this.setCustomerId(customerId);
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
		case "idCustomer":
			this.setCustomerId((int)input);
			break;
		case "lastName":
			this.setLastName((String)input);
			break;
		case "mobileNumber":
			this.setMobileNumber((int)input);
			break;
		case "emailAddress":
			this.setEmailAddress((String)input);
			break;
		}
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
	
	

}
