package com.fdmgroup.servletdemos.dao;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.servletdemos.model.Student;

public class ListDao implements IStorange {
	
	private static List<Student> students = new ArrayList<>();

	@Override
	public boolean create(Student student) {
		try {
			students.add(student);
			return true;
		}catch(RuntimeException e) {
			return false;
		}
		
	}

	@Override
	public List<Student> read() {
		return students;
	}

}
