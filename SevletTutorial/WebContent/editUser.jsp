<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/SevletTutorial/editUser" method="post">
        <label> Username: </label>
        <input type="text" name="username" value="${us.username}" ><br>
        <label> Password:&nbsp;</label>
        <input type="text" name="password" value="${us.password}" > <br>
        <label> Avatar: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
        <input type ="text" name ="avatar" value="${us.avatar}" > <br>
        <label>&nbsp; </label>
        <input type="hidden" name="stt" value="${us.stt}">
        <input type="submit" value="Update" name="update">
    </form>
</body>
</html>