<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <form action="/SevletTutorial/addUser" method="post">
        
        <label> Username: </label>
        <input type="text" name="username"><br>
        <label> Password: </label>
        <input type="text" name="password"> <br>
        <label> Role: </label> 
        <select name="role">
		  <option value="1">Administrator</option>
		  <option value="0" selected>User</option>
		</select> <br>
		<label>Avatar: </label>
		<input type="text" name ="avatar"> <br>
<!--  		<label>Choose Avatar</label> 
        <input type="file" name="avatar" /> <br/>
       <label>Choose Avatar</label> 
        <input type="file" name="avatar" /> <br/> -->
        <label>&nbsp; </label>
        <input type="submit" value="Add" name="add">
    </form>
</body>
</html>