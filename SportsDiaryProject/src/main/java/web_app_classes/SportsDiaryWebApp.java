package web_app_classes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.json.JSONObject;

import sportsDiary.LogIn;

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
}
