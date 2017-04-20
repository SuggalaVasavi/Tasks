package restlog1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 
import restlog1.UserVO;
 
public class LoginHandler {
	 private Connection connection;
	public LoginHandler() throws Exception{
		connection=DbConnection.getConnection();
	}
	 public void addUser(UserVO user){
	try {
	//String uname = request.getParameter("uname");
	PreparedStatement ps = connection.prepareStatement("INSERT INTO user(username,password,firstname,email,lastname)VALUES(?,?,?,?,?)");
	ps.setString(1,user.getUsername());
	ps.setString(2, user.getPassword());
	ps.setString(3,user.getFirstname());
	ps.setString(4,user.getEmail());
	ps.setString(5, user.getLastname());
	ps.executeUpdate();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	 }
 
public ArrayList<UserVO> getAllUsers(Connection connection) throws Exception {
ArrayList<UserVO> userList = new ArrayList<UserVO>();
try {
// String uname = request.getParameter("uname");
PreparedStatement ps = connection
.prepareStatement("SELECT * FROM user");
// ps.setString(1,uname);
ResultSet rs = ps.executeQuery();
while (rs.next()) {
UserVO uservo = new UserVO();
uservo.setUsername(rs.getString("username"));
uservo.setPassword(rs.getString("password"));
userList.add(uservo);
}
return userList;
} catch (Exception e) {
throw e;
}
}
 
}