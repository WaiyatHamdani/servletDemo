package com.fdmgroup.servletdemos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.servletdemos.dao.IStorange;
import com.fdmgroup.servletdemos.dao.ListDao;
import com.fdmgroup.servletdemos.model.Student;

/**
 * Servlet implementation class DisplayStudents
 */
public class DisplayStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}


	public void destroy() {
		// TODO Auto-generated method stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStorange dao = new ListDao();
		List<Student>studentlist = dao.read();
		
		request.setAttribute("studentlist", studentlist);
		RequestDispatcher dispatcher=request.getRequestDispatcher("displayStudentsJSP");
		
		dispatcher.forward(request, response);
		
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head><title> Student List</title>");
//		out.println(" <link rel=\"stylesheet\" href=\"demo.css\"> ");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<div class=\"center\">");
//		out.println("<h1>display list</h1>");
//		for (Student temp:studentlist) {
//		out.println("<p>Student" +temp+"</p>");
//		}
//		out.println("<a href=\"home.html\"> home</a>");
//		out.println("</div>");
//		out.println("</body>");
//		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
