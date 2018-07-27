package sportsDiary;

import java.sql.*;
import java.util.ArrayList;


public class JavaDataBaseConnector {

	static private final String DBUrl ="jdbc:mysql://localhost/SporsDataBase";
	
	static private final String user ="root";
	static private final String pass = "Password@1234";
	private Connection con;
	private Statement stat;
	
	public void connect() 
	{
		try 
		{
			con = DriverManager.getConnection(DBUrl,user,pass);
			stat = con.createStatement();
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		}
		catch(SQLException sq)
		{
			sq.printStackTrace();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private void closeConnection() 
	{
		try {
			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void create(String Statement)
	{
		this.connect();
		try {
			stat.executeQuery(Statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeConnection();
	}
	public ResultSet read(String Statement) 
	{
		this.connect();
		try(ResultSet re = stat.executeQuery(Statement);) {
			this.closeConnection();
			return re;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeConnection();
		return null;
	}
	public void update(String Statement) 
	{
		this.connect();
		try {
			stat.executeQuery(Statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeConnection();
	}
	public void delete(String statement) 
	{
		this.connect();
		try {
			stat.executeQuery(statement);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeConnection();
	}
}
