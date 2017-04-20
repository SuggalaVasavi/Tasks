
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>

<style>
*{
	margin:0px;
	padding:0px;
	}
body{
	font-family:Tahoma, Geneva, sans-serif;
	}
#container{
	width:550px;
	background-color:rgba(250,250,252,.9);
	margin:auto;
	margin-top:10px;
	margin-bottom:10px;
	box-shadow:0 0 3px #999;
	}
#container_body{
	padding:20px;
	}
.form_title{
	font-size:35px;
	color:#141823;
	text-align:center;
	padding:10px;
	font-weight:normal;
	}
.head_para{
	font-size:19px;
	color:#99a2a7;
	text-align:center;
	font-weight:normal;
	}
#form_name{
	padding:25px 0 0 15px;
	}
.firstnameorlastname{
	 margin-right:20px;
	}
.input_name{
	width:207px;
	padding:5px;
	font-size:18px;
	}
#email_form{
	clear:both;
	padding:15px 0 10px 0px;
	}
.input_email{
	width:234px;
	padding:5px;
	font-size:18px;
	}
#Re_email_form{
	padding:10px 0 10px 0px;
	}
.input_Re_email{
	width:234px;
	padding:5px;
	font-size:18px;
	}
#password_form{
	padding:10px 0 10px 0px;
	}
.input_password{
	width:234px;
	padding:5px;
	font-size:18px;
	}

select{
	padding:5px;
	}


#sign_user{
	font-size:14px;
	text-align:center;
	background-color:white;
	padding:10px;
	margin-top:10px;
	cursor: pointer;
	}
#errorBox{
	color:#F00;
	}
#sign_user1{
	font-size:10px;
	text-align:center;
	background-color:white;
	padding:8px;
	margin-top:5px;
	cursor: pointer;
	}


</style>

</head>
 <body bgcolor="#4682b4">
  <div id=sign_user1>
     <center><h1 style="color:black">REGISTERATION FORM</h1></center>
     </div>
    <br>
    <br><br>
<body>
<center>
  
                   
             <form action="REST/WebService/register" method="post">
              <div id="errorBox"></div>
               <div id="Re_email_form">
                       <h5 style="color:white"> First Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       <input type="text" pattern="[A-Za-z0-9]{1,20}" name="firstname" value=""  maxlength=20  class="input_email" required/>
                    </h5></div>
                  <div id="Re_email_form">
                       <h5 style="color:white"> Last Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       <input type="text" pattern="[A-Za-z0-9]{1,20}" name="lastname" value="" class="input_email" required/>
                    </h5></div>
                  <div id="Re_email_form">
                       <h5 style="color:white"> Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="text" name="email" value="" pattern="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$" class="input_email" required="true"/>
                   </h5></div>
                    
                  <div id="Re_email_form">
                      <h5 style="color:white">  User Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="text" name="username" value="" class="input_Re_email" required/>
                   </h5> </div>
                   <div id="Re_email_form">
                      <label for="password" style="color:white">  Password:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       <input type="password" id="password" name="password" value="" class="input_password" required/>
                    </div>
                    <div id="Re_email_form">
                       <label for="confirmpassword" style="color:white"> Confirm Password:</label>
                        <input type="password" id=confirmpassword" name="confirmpassword" value="" class="input_password" onblur="confirmPass()" required/>
                    </div>
                    <div >
                        <input type="submit" value="Submit" />
                        <input type="reset" value="Reset" />
                    </div>
                    <div id="sign_user">
                        <p colspan="2" style="color:black">Already registered!! <a href="NewFile.jsp">Login Here</a></p>
                    </div>
             
            </center> 
            </form>
   </center>
   <script type="text/javascript">
    function confirmPass() {
        var pass = document.getElementById("password").value
        var confPass = document.getElementById("confirmpassword").value
        if(pass != confPass) {
            alert('Wrong confirm password !');
        }
    }
</script>
</body>
</html>
           