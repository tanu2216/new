package com.cg.sms.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.sms.dto.Student;
import com.cg.sms.service.StudentService;
import com.cg.sms.service.StudentServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService service = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		do{
			System.out.println("1. Add Student");
			System.out.println("2. Display Student Details");
			System.out.println("3. Update Details");
			System.out.println("4. Display Student List");
			System.out.println("5. Exit");

			ch = sc.nextInt();

			switch (ch) {

			case 1:
				
				Student student = new Student();
				System.out.println("Enter Name: ");
				String name = sc.next();

				System.out.println("Enter Course Name: ");
				String cname = sc.next();

				System.out.println("Enter age: ");
				int age = sc.nextInt();

				System.out.println("Enter Mobile Number: ");
				String mob = sc.next();

				student.setName(name);
				student.setCourseName(cname);
				student.setAge(age);
				student.setMobNo(mob);
				int rn = service.addStudent(student);
				System.out.println("Student record added with roll number " + rn);

				break;

			case 2:
				System.out.println("Enter an existing Roll Number: ");
				rn = sc.nextInt();
				
				student = service.getStudent(rn);
				if(student != null){
					System.out.println(student.getName());
					System.out.println(student.getAge());
					System.out.println(student.getCourseName());
					System.out.println(student.getMobNo());
				}
				else
					System.out.println("Record not found!!!");
				
				break;

			case 3:
				
				System.out.println("Enter Roll Number: ");
				rn = sc.nextInt();
				
				student = service.getStudent(rn);
				if(student == null)
					System.out.println("Record not found!!!");
				else{
					System.out.println("Enter new mobile Number: ");
					String mobNo = sc.next();
					student.setMobNo(mobNo);
					student = service.updateStudent(student);
					System.out.println("Record updated for "+rn);
					
					System.out.println(student.getName());
					System.out.println(student.getMobNo());
				}
				break;
				
			case 4:
				System.out.println("Enter Course name: ");
				cname = sc.next();
				
				ArrayList<Student> list = service.getStudentList(cname);
				
				if(list.size() == 0)
					System.out.println("No student enrolled within this course...");
				else{
					for(Student s : list)
						System.out.println(s.getName()+" "+s.getMobNo());
				}
				break;
			default:
				ch = 5;
				break;
			}
			
		
		}while(ch != 5);
		
		sc.close();		
	}
}
