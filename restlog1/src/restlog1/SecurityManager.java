package restlog1;

import java.sql.Connection;
import java.util.ArrayList;
 
import restlog1.UserVO;
 
import restlog1.DbConnection;
 
import restlog1.LoginHandler;
 //import restlog1.LoginHandler1;
public class SecurityManager {
public ArrayList<UserVO> getAllUsersList()throws Exception {
ArrayList<UserVO> userList = null;
try {
DbConnection database= new DbConnection();
Connection connection = database.getConnection();
LoginHandler loginHandler= new LoginHandler();
//LoginHandler1 loginHandler1= new LoginHandler1();
userList= loginHandler.getAllUsers(connection);

} catch (Exception e) {
throw e;
}
return userList;
}
}