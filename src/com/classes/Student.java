
package com.classes;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{

	int rollno;
	String name;
	
	public Subject sub[];
	
	
	public Subject[] getSub() {
		return sub;
	}

	public void setSub(Subject[] sub) {
		this.sub = sub;
	}

	public Student()
	{
		rollno=0;
		name="";
	}
	
	@Override
	public String toString()
	{
		return rollno+"\t"+name;
	}
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Subject sub[][]=new Subject[5][5];
		Student std[]=new Student[20];
		System.out.println("Enter no of student:");
		int n=sc.nextInt();
		float total=0.0f;
		
		for(int i=0;i<n;i++)
		{
			
			std[i]=new Student();
			System.out.println("Enter roll no of student:");
			std[i].setRollno(sc.nextInt());
			System.out.println("Enter name of student:");
			std[i].setName(sc.next());
			
			for(int j=0;j<5;j++)
			{
				
				sub[i][j]=new Subject();
				System.out.println("Enter subject name:");
				sub[i][j].setName(sc.next());
				System.out.println("Enter marks:");
				sub[i][j].setMarks(sc.nextFloat());
			  total = total+sub[i][j].getMarks();
				
			}
				sc.close();
		}
		
		
		for(int i=0;i<n;i++)
		{
			total=0;
			System.out.println("--------------------------------");
			System.out.println("Roll no : "+std[i].getRollno());
			System.out.println("Name : "+std[i].getName());
			System.out.println("--------------------------------");
			System.out.println("Subject\tMarks");
			System.out.println("--------------------------------");
			for(int j=0;j<5;j++)
			{
				System.out.println(sub[i][j].getName()+"\t"+sub[i][j].getMarks());
			}
			System.out.println("--------------------------------");
			System.out.println("Total:\t"+total);
			
		}
		
		
	}
}
