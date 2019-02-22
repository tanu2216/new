package com.cg.sms.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.sms.dto.Student;

public class DataContainer {
	
	private static Map<Integer, Student> students;
	
	public static Map<Integer, Student> createCollection() {
		
		if(students == null)
			students = new HashMap<Integer, Student>();
		
		return students;
	}
}
