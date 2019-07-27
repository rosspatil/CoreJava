package com.collection;
import com.classes.Student;
import com.classes.Subject;

import java.util.*;

public class Test_comparator  {
	
   public static void main(String[] args)
   {
	/*ArrayList<Student> a=new ArrayList<Student>();
	
	a.add(new Student(1, "abc"));
	a.add(new Student(2,"xyz"));
	
	for (Student student : a) {
		System.out.println(student);
	}*/
	   
	   
	   TreeSet<Student> t=new TreeSet<Student>(new Mycomp());
	   //TreeSet<Subject> t1=new TreeSet<Subject>(new Mycompa());
	   Subject[][] s=new Subject[5][5];
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter no of students: ");
	   int n=sc.nextInt();
	   for (int i = 0; i < n; i++) {
		   System.out.println("Enter details of student...");
		   t.add(new Student(sc.nextInt(), sc.next()));
		   for (int j = 0; j < 2; j++) {
			   System.out.println("Enter "+(j+1)+"th subject name and marks..");
			// t1.add(new Subject(sc.next(), sc.nextFloat()));
			 s[i][j]=new Subject(sc.next(), sc.nextFloat());
		}
	}
	   /*for (Student student : t) {
		  System.out.println(student);
		   for (Subject subject : t1) {
				System.out.println(subject);
			}
		   
		}*/
	   Iterator<Student> itr=t.iterator();
	   for (int i = 0; i < n; i++) {
		   
		 System.out.println(itr.next());
		 
			   for (int j = 0; j <2; j++) {
				System.out.println(s[i][j]);
			}
	
	}
	
	}
}

class Mycomp implements Comparator<Student>
{
	@Override
	public int compare(Student a,Student b)
	{
		String s1=a.getName();
		String s2=b.getName();
		
		return s1.compareTo(s2);
	}
	
}
	
/*class Mycompa implements Comparator<Subject>
{
	@Override
	public int compare(Subject x,Subject y)
	{
		float m1=x.getMarks();
		float m2=y.getMarks();
		return Float.compare(m1, m2);
	}
}*/