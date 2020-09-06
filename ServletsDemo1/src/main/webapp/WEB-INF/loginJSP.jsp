<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if(session.getAttribute("user") == null){%>

	<form action="loginServlet" method="post">
		<input type="text" name="username" placeholder="username"/>
		<br>
		<input type="password" name="password" placeholder="password"/>
		<br>
		<input type="submit" value="login" />
	</form>
	
	<%}else{%>
		Welcome <%=session.getAttribute("user") %> <br>
		<a href="home.html"> home... </a>
		<br>
		<a href=logoutServlet>Logout</a>
	<%}%>


</body>
</html>