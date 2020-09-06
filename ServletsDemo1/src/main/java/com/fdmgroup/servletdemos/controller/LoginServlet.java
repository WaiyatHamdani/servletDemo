package com.fdmgroup.servletdemos.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = "DBUser";
		String pwd = "DBPwd";
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals(user) && password.equals(pwd)) {
			HttpSession session =request.getSession();
			session.setAttribute("user", username);
			
		}
		
		response.sendRedirect("loginJSP");
		
		
		
	}

}
