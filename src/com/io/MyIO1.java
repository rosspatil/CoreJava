package com.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import com.classes.Student;
import com.swing.StudentResult1;

public class MyIO1 {
	
	static void objectOutput(String name) throws FileNotFoundException, IOException{
		int roll=1;
		String stname="jagruti";
		ObjectOutputStream objectout=new ObjectOutputStream(new FileOutputStream(new File(name)));
		
		
		Vector<Student> s=new Vector<Student>();
		
			s.add(new Student(1,"jagruti"));
			s.add(new Student(2, "roshan"));
			
		
		objectout.writeObject(s);
		
		
		
		System.out.println("object is written......");
		
		
		
		
	}
	
	static void objectInput(String name) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		ObjectInputStream objectin=new ObjectInputStream(new FileInputStream(new File(name)));
//		Vector<StudentResult1> s=new Vector<StudentResult1>();
//		
//		s=(Vector<StudentResult1>)objectin.readObject();
//		for (Object obj:s) {
//			System.out.println(obj);
//		}
		
		StudentResult1 s;
		s=(StudentResult1)objectin.readObject();
		System.out.println("object is read......");
		
		
		
		
	}
	
   static void dataOutput(String name) throws Exception {
		int roll=1;
		String str="jagruti";
		float marks=100.0F;
		DataOutputStream dataOut=null;
	    dataOut=new DataOutputStream(new FileOutputStream(new File(name)));
		dataOut.writeInt(roll);
		dataOut.writeUTF(str);
		dataOut.writeFloat(marks);
		
		System.out.println("Data is Written.........");
		
		
		
	}
   
   
	
	
	
	
	static void dataInput(String name) throws Exception {
		int roll=0;
		String str="";
		float marks=0.0f;
		
		DataInputStream datain=new DataInputStream(new FileInputStream(new File(name)));
		
		
			roll=datain.readInt();
			str=datain.readUTF();
			marks=datain.readFloat();
			
		
		
		System.out.println(roll+"\t"+str+"\t"+marks);
	}
	
	
	public static void main(String[] args) throws Exception {
		
//		dataOutput("D:\\hello.txt");
//		dataInput("D:\\hello.txt");
		//objectOutput("D:\\Object.dat");
		objectInput("D:\\StudentResult.dat");
	}

}
