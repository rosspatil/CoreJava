package com.collection;

import java.util.Scanner;

import com.classes.Student;
import com.classes.Subject;



public class Assignment {

	public static void main(String[] args) {
		
		Student s[]=new Student[3];
		Scanner sc=new Scanner(System.in);
		Subject s1[]=new Subject[3];
		
		System.out.println("Enter no of student:");
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			s[i]=new Student();
			System.out.println("Enter details of student..");
			s[i].setRollno(sc.nextInt());
			s[i].setName(sc.next());
			
			for (int j = 0; j < 2; j++) {
			
				System.out.println("Enter name and marks of subject..");
				s1[j].setName(sc.next());
				s1[j].setMarks(sc.nextFloat());
				s[i].setSub(s1);
					
				
			}
			
		}
		
 for (int i = 0; i < n; i++) {
	System.out.println(s[i].getRollno());
	System.out.println(s[i].getName());
	for (int j = 0; j < 2; j++) {
		s1=s[i].getSub();
		System.out.println(s1[j].getMarks());
		System.out.println(s1[j].getName());
	}
	
}		
		
	}
}

	
