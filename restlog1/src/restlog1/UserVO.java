package restlog1;

public class UserVO {
	 
private String username;
private String password;
private String firstname;
private String lastname;
private String email;
private String confirmpassword;

public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
 public void setFirstname(String firstname){
	 this.firstname=firstname;
 }
 public String getFirstname(){
	 return firstname;
	 
 }
 public void setLastname(String lastname){
	 this.lastname=lastname;
 }
 public String getLastname(){

	return lastname;
}
 public void setEmail(String email){
	 this.email=email;
 }
 public String getEmail(){
	 return email;
}
public void setConfirmpassword(String confirmpassword){
	this.confirmpassword=confirmpassword;
}
public String getConfirmpassword(){
	return confirmpassword;
}
@Override
public String toString(){
	return "user [Firstname="+firstname+",Lastname="+lastname+",Email="+email+"]";
}
}
