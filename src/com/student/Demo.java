package com.student;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentDaoImp s=new StudentDaoImp();
		int ch=0;
		Student student;
		do{
			System.out.println("1.Add\n2.Update\n3.Delete\n4.Getall");
			System.out.println("Enter your choice:  ");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter name: ");
				String name=sc.next();
				System.out.println("Enter Roll: ");
				int roll=sc.nextInt();
				student=new Student(name, roll);
				s.addStudent(student);
				break;
			case 2:
				System.out.println("Enter name: ");
				 name=sc.next();
				System.out.println("Enter Roll: ");
				roll=sc.nextInt();
				student=new Student(name, roll);
				s.updateStudent(student);
				break;
			case 3:

				System.out.println("Enter name: ");
				 name=sc.next();
				System.out.println("Enter Roll: ");
				roll=sc.nextInt();
				student=new Student(name, roll);
				s.deleteStudent(student);
				break;
			case 4:
				Hashtable<Integer, Student> stud=s.getAllStudent();
				Enumeration all=stud.elements();
				while (all.hasMoreElements()) {
					Student obj = (Student) all.nextElement();
					System.out.println("Name: "+obj.getName()+"\t Roll: "+obj.getRoll());
					
				}

				break;


			}
		}while(ch<5);

	}
}
