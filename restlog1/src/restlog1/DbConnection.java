package restlog1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DbConnection {
	private static Connection connection=null;
 
public static Connection getConnection() throws Exception
{
		
try
{
String connectionURL = "jdbc:mysql://localhost:3306/form";
Connection connection = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
connection = DriverManager.getConnection(connectionURL, "root", "1234");
return connection;
}
catch (SQLException e)
{
e.printStackTrace();
}
catch (Exception e)
{
e.printStackTrace();
}
return connection;
}
}
