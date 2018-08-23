package sports_diary;


import java.sql.*;
import java.util.ArrayList;

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
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
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
	public ArrayList<Object> read(String Statement, String dataType) 
	{
		this.connect();
		ArrayList<Object> results = new ArrayList<>();
		try(ResultSet re = stat.executeQuery(Statement);) {
			Object info = new Object();
			while (re.next())
			{
				ResultSetMetaData rsmd = re.getMetaData();
				switch(dataType)
				{
					case "account":
						info = new Account(-1,-1,"null","null","null");
						for(int i=1;i<=rsmd.getColumnCount();i++) 
						{
							((Account) info).imputResultData(rsmd.getColumnName(i),re.getObject(i));
						}		
						break;
					case "customer":
						info=new Customer("null","null","null","null");
						for(int i=1;i<=rsmd.getColumnCount();i++) 
						{
							((Customer)info).imputResultData(rsmd.getColumnName(i),re.getObject(i));
						}
						break;
				}
				results.add(info);
			}
			this.closeConnection();
			return results;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeConnection();
		return results;
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
