package MySqlConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/harman";
		String user="Amruta";
		String password="Amruta@1172000";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("connection is successful with database"+url);
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
