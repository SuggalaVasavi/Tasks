<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Example</title>
<style>
form {
}

input[type=text], input[type=password] {
    width: 60%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box; 
    
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 40%;
     align:center;
     margin: 0 auto;
}

button:hover {
    opacity: 0.8;
     align:center;
}
.container {
    padding: 16px;
   
    
    
}
</style>
    </head>
    <body style="align:center" bgcolor="#999999">
    <center>
        <form action="REST/WebService/login" method="post" >
        <fieldset style="width: 300px">
            <legend> Login to App </legend>
         <div class="container ">
    <label><b>User Name:</b></label>
    <input type="text" placeholder="Enter Username" name="username" value="" required><br>

    <label><b>Password:</b></label>&nbsp;&nbsp;
    <input type="password" placeholder="Enter Password" name="password" value="" required style="height: 41px; ">
        
    <button type="submit">Login</button>
    <button type="reset">Reset</button><br>
   <span>Yet Not registered!! <a href="reg.jsp">Register Here</a></span>
  </div>
</fieldset>
        </form>
        </center>
</body>
</html>