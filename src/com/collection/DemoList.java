package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class DemoList {

	
	
	public static void main(String[] args) {
		List<String> arrayList=new ArrayList<>();
		List<String> linkedList=new LinkedList<>();
		List<String> vector=new Vector<>();
		Stack<String> stack=new Stack<>();
		
		arrayList.add("one");
		arrayList.add("two");
		
		
		linkedList.add("one");
		linkedList.add("two");
		
		
		vector.add("one");
		vector.add("two");
		
		
		stack.push("one");
		stack.push("two");
		
		System.out.println(arrayList);
		System.out.println(linkedList);
		System.out.println(vector);
		System.out.println(stack);
		
	}
}
