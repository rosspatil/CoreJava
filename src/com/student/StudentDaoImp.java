package com.student;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;

public class StudentDaoImp  implements StudentDao{

	Student student;
	Hashtable<Integer, Student>  stud=new Hashtable<>();
	Scanner sc=new Scanner(System.in);
	
	
	@Override
	public Hashtable<Integer, Student> getAllStudent() {
		return stud;		
	}

	@Override
	public void updateStudent(Student st) {
		String name;
		int roll;
		stud.remove(st);
		System.out.println("Enter new  name: ");
		 name=sc.next();
		System.out.println("Enter new Roll: ");
		 roll=sc.nextInt();
		student=new Student(name, roll);
		stud.put(roll, student);		
	}

	@Override
	public void deleteStudent(Student st) {
		
		stud.remove(st.getRoll());
	}

	@Override
	public void addStudent(Student st) {
			stud.put(st.getRoll(), st);
	}

}
