package com.collection;

import java.util.Stack;

public class Test_stack {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<Integer>();
	System.out.println(s.isEmpty());
	s.push(1);
	s.push(2);
	System.out.println(s.peek());
	System.out.println(s.pop());
	s.add(3);
	s.add(4);
	System.out.println(s.search(4));
}
}
