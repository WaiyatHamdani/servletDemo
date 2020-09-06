package com.fdmgroup.servletdemos.dao;

import java.util.List;

import com.fdmgroup.servletdemos.model.Student;

public interface IStorange {
	//CR  "UD"?
	
	boolean create (Student student);
	List<Student> read();

	

}
