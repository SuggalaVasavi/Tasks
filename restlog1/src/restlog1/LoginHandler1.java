package restlog1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import restlog1.UserVO;
import restlog1.DbConnection;
public class LoginHandler1 {
	int y=0;
	String result="false";
		 private Connection connection;
		public LoginHandler1() throws Exception{
			connection=DbConnection.getConnection();
		}
		 public String addUser(UserVO user){
		try {
		//String uname = request.getParameter("uname");
		PreparedStatement ps = connection.prepareStatement("INSERT INTO user(username,password,firstname,email,lastname)VALUES(?,?,?,?,?)");
		ps.setString(1,user.getUsername());
		ps.setString(2, user.getPassword());
		ps.setString(3,user.getFirstname());
		ps.setString(4,user.getEmail());
		ps.setString(5, user.getLastname());
 y = ps.executeUpdate();
 if(y==1){
	 result="Successfully Registered";
	 System.out.println(user.getUsername());
 }
 connection.close();
} catch (Exception e)
 {
 e.printStackTrace();
 }

 return result;
}
}