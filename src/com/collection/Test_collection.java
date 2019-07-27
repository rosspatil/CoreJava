package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Test_collection {

	public static void main(String[] args) {
	// String s="abc";
		ArrayList<String> a1= new ArrayList<String>();
	//	ArrayList<String> a2=new ArrayList<String>(s);
		ArrayList<String> a3=new ArrayList<String>(5);
		
		System.out.println(a1);
		a1.add("J");
		System.out.println(a1);
		a1.add("A");
		System.out.println(a1);
		System.out.println(a1.size());
		a1.add("R");
		System.out.println(a1);
		a1.add(2,"G");
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
		a1.remove("R");
		System.out.println(a1);
		//a1.clear();
		//System.out.println(a1.size());

		/*
		Hashtable ht=new Hashtable();
		ht.put("101", "Vishal");
		ht.put("102", "Amar");
		ht.put("103", "Akbar");
		*/
		HashMap ht =new HashMap();
		ht.put("101", "Vishal");
		ht.put("102", "Amar");
		ht.put("103", "Akbar");
		
		/*
		Enumeration enums=ht.elements();
		while(enums.hasMoreElements()) {
			System.out.println(enums.nextElement());
		}
		*/
		Iterator itr=ht.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr=ht.values().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr=ht.keySet().iterator();
		while(itr.hasNext()) {
			Object key=itr.next();
			System.out.println(key+":"+ht.get(key));
		}
	}
}
