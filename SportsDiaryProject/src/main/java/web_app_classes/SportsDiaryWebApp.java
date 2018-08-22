package web_app_classes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.json.JSONObject;

import sportsDiary.Account;
import sportsDiary.Customer;
import sportsDiary.LogIn;
import sportsDiary.SignUp;

@Path("/web")
public class SportsDiaryWebApp {
	
	@GET
	@Produces("Application/json")
	@Path("/logIn/{username}/{password}")
	public String login(@PathParam("username") String username, @PathParam("password") String password) 
	{
		LogIn log = new LogIn();
		if (log.processData(username, password)==true) 
		{
			return "{\"result\":\"true\"}";
		}
		else
		{
			return "{\"result\":\"false\"}";
		}
	}
	
	@POST
	@Path("/createCustomer")
	public void createCustomer(Customer c) 
	{
		System.out.println(c.getFirstName()+" "+c.getLastName()+" "+c.getMobileNumber()+" "+c.getEmailAddress());
		SignUp su = new SignUp();
		su.signUpInsertCustomer(c.getFirstName(), c.getLastName(), c.getMobileNumber(), c.getEmailAddress());
	}
	
	@POST
	@Path("/createAccount")
	public void createAccount(Account a) 
	{
		SignUp su = new SignUp();
		su.SignUpAccountInsert(a.getUsername(), a.getPassword());
	}
	
}
