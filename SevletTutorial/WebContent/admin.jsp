<%@page import="user.user"%>
<%@page import="java.util.List"%>
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
 <p>You are successfully logged in!</p>
 <a href="/SevletTutorial//addUser">Add User</a>
 <a href="/SevletTutorial/logout">Logout</a>
 	<table border="1">
		<tr>
			<th>ID</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Role</th>
			<th>Avatar</th>
			<th>Edit</th>
			<th>Delete</th>
			
		</tr>
		<c:forEach items="${userList}" var="user">
		<tr>
			<td>${user.stt}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			<td>${user.role}</td>
			
      <c:url value="/imeg?fname=${user.avatar}" var="imgUrl"></c:url>
			<td><img height="70" width="90" src="${imgUrl}"/></td>
		
			<td><a href="editUser?stt=${user.stt}">Edit</a></td>
			<td><a href="deleteUser?stt=${user.stt}">Delete</a></td>
		</tr>
		
		</c:forEach>
		
	</table>
	<form action="/SevletTutorial/SeachUser" method="GET">
	 <input type ="text" name = "username" />
	 <input type ="submit" value ="Search"/>
	</form>
</body>
</html>