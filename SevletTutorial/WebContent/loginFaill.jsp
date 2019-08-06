<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
   
     <form action="/SevletTutorial/login" method="post">

	 <h2>Please Login</h2> 
	 <h3 style="color: red">Dang nhap that bai, vui long thu lai</h3>
         <%= "Username:" %> 
         <input type="text" name="username"/>
         <br>
   
         <%="Password:" %> 
		 <input type="password"  name="password"/>
         <br>
         <input type="submit" value="login" />
      

   
    </form> 
</body>
</html>