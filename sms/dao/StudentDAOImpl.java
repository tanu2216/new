package com.cg.sms.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.cg.sms.dto.Student;

public class StudentDAOImpl implements StudentDAO {
	
	Map<Integer, Student> studentMap;
	public StudentDAOImpl() {
		// TODO Auto-generated constructor stub
		studentMap = DataContainer.createCollection();
	}
	
	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		int rollNo = (int) (1000 * Math.random());
		student.setRollNo(rollNo);
		studentMap.put(rollNo, student);
		return rollNo;
	}

	@Override
	public Student getStudent(int rn) {
		// TODO Auto-generated method stub
		Student studs = studentMap.get(rn);
		return studs;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentMap.put(student.getRollNo(), student);
		return student;
	}

	@Override
	public ArrayList<Student> getStudentList(String courseName) {
		// TODO Auto-generated method stub
		Collection<Student> studList = studentMap.values();
		ArrayList<Student> students = new ArrayList<Student>();
		for(Student s : studList){
			if(s.getCourseName().equals(courseName))
				students.add(s);
		}
		return students;
	}

}
