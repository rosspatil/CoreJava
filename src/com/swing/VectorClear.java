package com.swing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Vector;



public class VectorClear  {

	
	public static void main(String[] args) throws Exception {

 
		Vector<String> v= new  Vector<>();
		Vector<String> s=new Vector<>();
		Vector<String> m=new Vector<>();
		
		m.add("roshan");
		m.add("patil");
		s.addAll(m);
		v.addAll(s);
		m.clear();
		s.clear();
		m.add("patil");
		s.addAll(m);
		v.addAll(s);
		System.out.println(v);
		
	}
}
