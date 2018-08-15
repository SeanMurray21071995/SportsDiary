package sportsDiary;

import java.sql.*;


public class JavaDataBaseConnector {

	static private final String DBUrl ="jdbc:mysql://localhost/mydb?useSSL=false";
	static private final String user ="root";
	static private final String pass = "Password";
	private Connection con;
	private Statement stat;
	
	public void connect() 
	{
		try 
		{ 
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(DBUrl,user,pass);
			stat = con.createStatement();
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
		}
		catch (SQLException e) 
		{ 
			e.printStackTrace();
		}
	}
	public void create(String Statement)
	{
		this.connect(); 
		try {
			stat.executeUpdate(Statement);
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
			stat.executeUpdate(Statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeConnection();
	}
	public void delete(String statement) 
	{
		this.connect();
		try {
			stat.executeUpdate(statement);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeConnection();
	}
}
