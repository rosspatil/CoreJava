package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test_vector {

	public static void main(String[] args) {
	/*	Vector<Integer> v= new Vector<Integer>();
		System.out.println(v.capacity());
		v.addElement(4);
		v.addElement(5);
		System.out.println(v);
		v.contains(v);
		System.out.println(v);
		System.out.println(v.elementAt(1));
		System.out.println(v.firstElement());
		System.out.println(v.isEmpty());
		
	/*	Enumeration<Integer> e=v.elements();
		System.out.println(e.nextElement());
		System.out.println(e.nextElement());*/
		
		/*Iterator<Integer> i=v.iterator();
		System.out.println(i.next());
		System.out.println(i.next());*/
		
		/*for(int j:v)
		{
			System.out.println(j);
		}*/
		
		
		Vector<Object> v=new Vector<Object>();
		v.add(3);
		v.add("abc");
		v.add(5.5f);
		
		System.out.println(v.hashCode());
		
		Iterator i=v.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
		for (Object object : v) {
			System.out.println(object);
			
		}
		
}
}
