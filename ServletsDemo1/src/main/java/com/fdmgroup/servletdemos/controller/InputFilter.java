package com.fdmgroup.servletdemos.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InputFilter implements Filter {

    
    public InputFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String name = request.getParameter("name");
		if (name.equalsIgnoreCase("Hello")) {
			RequestDispatcher rd = request.getRequestDispatcher("addStudent.html");
			rd.forward(request, response);
			
		}else {
			chain.doFilter(request, response);
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
