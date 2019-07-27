package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class Test_treeset {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		System.out.println(t);
		
		for(int i:t)
		{
			System.out.println(i);
		}
		
		System.out.println(t.descendingSet());
	}
	
}
