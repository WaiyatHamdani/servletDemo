<%@ page language="java" 
contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<%@ page import = "java.util.*, com.fdmgroup.servletdemos.model.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Student</title>
</head>
<body>
		<div class="center">
		<h1>display list</h1>
		
		<h3><%= request.getAttribute("studentlist") %></h3>
		<p>This is My JSP page</p>
		
		
		
		<p>
		
		<% 
		List<Student> students=(List<Student>)request.getAttribute("studentlist");
		for(Student temp : students){
			out.println(temp);
			out.println("<br>");
		}
		%>
		
		
		
		</p>	
		
		<c:forEach var="s" items="${studentlist}">
			<p>${s}</p>
		</c:forEach>
		
		



				<% 
		List<Student> students1=(List<Student>)request.getAttribute("studentlist");
		for(Student s : students1){%>
			<p><%=s %></p>
		<%}%>
		
		<table border=1>
		<tr>
		<th>id</th>
		<th>name</th>
		<th>password</th>
		</tr>
		
	
		
		<% for(Student s :students1){ %>
		<tr>
		<td><%=s.getId() %></td>
		<td><%=s.getName() %></td>
		<td><%=s.getPhone() %></td>
		<%} %>
		</tr>
		</table>	
		
		
		<table border=1>
		<tr>
		<th>id</th>
		<th>name</th>
		<th>password</th>
		</tr>
		
		<c:forEach var="s" items="${studentlist}">
		<tr>
		<td>${s.getId()}</td>
		<td>${s.getName()}</td>
		<td>${s.getPhone()}</td>
		</tr>
			
		</c:forEach>
		</table>
		
		
		<c:forEach var="s" items="${studentlist}">
			<p>${s}</p>
		</c:forEach>

		<a href="home.html"> home</a>
		
				<h4>${requestScope.studentlist}</h4>
				
				<h4>${studentlist}</h4>
		</div>
</body>
</html>