<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="user.user" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1> Dang nhap thanh cong</h1>
 <%--   <% user uss = (user)request.getSession().getAttribute("username");
     out.print("xin chao" + uss.getUsername() + uss.getPassword()); %>    --%>
         
     xin chao : <%= request.getAttribute("toi")%>
  
     
    
 	
 	
</body>
</html>