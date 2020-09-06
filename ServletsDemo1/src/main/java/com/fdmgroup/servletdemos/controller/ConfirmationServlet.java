package com.fdmgroup.servletdemos.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfirmationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String phone =request.getParameter("phone");
		
		boolean studentAdded = (boolean) request.getAttribute("added");
		
//		String myAlert = (String) request.getAttribute("myAlert");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title> Student List</title> <style>\r\n" + 
				"	.center{\r\n" + 
				"		margin: auto;\r\n" + 
				"  		width: 50%;\r\n" + 
				" 		border: 3px solid black;\r\n" + 
				" 		background-color:lightblue;\r\n" + 
				"  		padding: 10px;\r\n" + 
				"	}\r\n" + 
				"</style></head>");
		out.println("<body>");
		out.println("<div class=\"center\">");
		out.println("<h1>Confirmation servlet</h1>");
		out.println("<p>Student" +id+"</p>");
		out.println("<p>Student" +name+"</p>");
		out.println("<p>Student" +phone+"</p>");
		out.println("<a href=\"home.html\"> home</a>");
		//out.println("myalert:" + myAlert+"<br>");
		out.println("<p>");
		if(studentAdded) {
			out.println("student added");
		}else {
			out.println("student not added");
		}
		out.println("</p>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
