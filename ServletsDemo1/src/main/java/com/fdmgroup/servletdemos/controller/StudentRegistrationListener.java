package com.fdmgroup.servletdemos.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.fdmgroup.servletdemos.dao.IStorange;
import com.fdmgroup.servletdemos.dao.JDBCDao;
import com.fdmgroup.servletdemos.dao.ListDao;


public class StudentRegistrationListener implements ServletContextListener {
	private IStorange dao;
    
    public StudentRegistrationListener() {
        // TODO Auto-generated constructor stub
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

    
    public void contextInitialized(ServletContextEvent sce)  { 
    	//from web xml the param-name
         String daoOption= sce.getServletContext().getInitParameter("daoOption");
         if(daoOption != null && daoOption.equals("ListDao")) {
        	 dao =new ListDao();
         }else {
        	 dao = new JDBCDao();
         }
         
    }
	
}
