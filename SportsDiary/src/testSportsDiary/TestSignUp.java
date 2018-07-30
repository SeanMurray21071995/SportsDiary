package testSportsDiary;

import org.junit.Test;

import sportsDiary.SignUp;

public class TestSignUp {
	@Test
	public void checkPasswordSame(){
		SignUp su = new SignUp();
		su.signUpInsertCustomer("tes", "test", 00000000, "testest@test.com");
		
	}
	@Test 
	public void submitInfo()
	{
		
	}
	

}
