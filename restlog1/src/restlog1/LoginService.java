package restlog1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import restlog1.SecurityManager;
import restlog1.UserVO;
 
@Path("/WebService")
public class LoginService {
 
@POST
 @Path("/login")
 @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
 public String login(@FormParam("username") String username,
 @FormParam("password") String password) {
 
return getAllUsersList(username, password);
 
}
 
public String getAllUsersList(String username,String password)
 {
 String userListData = null;
 try 
 {
 ArrayList<UserVO> userList = null;
 SecurityManager securityManager= new SecurityManager();
 userList = securityManager.getAllUsersList();
 for (UserVO userVO : userList) {
 if(userVO.getUsername().equals(username))
 {
 if(userVO.getPassword().equals(password))
 {
 return "Logged in User:"+username;
 }
 }
 }
 
} catch (Exception e)
 {
 System.out.println("error");
 }
 return "You are not a Valid User";
 }
@POST
@Path("/register")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
public String reg(@FormParam("firstname") String firstname,
		@FormParam("lastname") String lastname,
		@FormParam("email") String email,
		@FormParam("username") String username,
		@FormParam("password") String password,
@FormParam("confirmpassword") String confirmpassword){
	String result="false";
	int x=0;
	try 
	 {
		DbConnection database= new DbConnection();
		Connection connection = database.getConnection();
		LoginHandler1 loginHandler1 =new LoginHandler1();
		ArrayList<UserVO> userList = null;
		 SecurityManager securityManager= new SecurityManager();
		PreparedStatement ps = connection.prepareStatement("INSERT INTO user(username,password,firstname,email,lastname)VALUES(?,?,?,?,?)");
		ps.setString(1,username);
		ps.setString(2, password);
		ps.setString(3,firstname);
		ps.setString(4,email);
		ps.setString(5,lastname);

		
		
	 userList = securityManager.getAllUsersList();
		 String EMAIL_PATTERN = 
				 "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				 + "+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
				 Pattern pattern = Pattern.compile(EMAIL_PATTERN);
if( email == null || email.trim().equals("")&& !pattern.matcher(email).matches()&& username == null || username.trim().equals("")&& firstname == null || firstname.trim().equals("")&& lastname == null || lastname.trim().equals(""))
{
					  
						  System.out.println("please enter valid details");
					  }
					  else{
					   x=ps.executeUpdate();
					   result="Successfully Registered";
					   connection.close();
				 }
				 
	
				 
	} catch (Exception e)
	 {
	 e.printStackTrace();
	 }

	 return result;
}
	 
}