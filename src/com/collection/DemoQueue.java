package com.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {
	public static void main(String[] args) {
		Queue<String> priority=new PriorityQueue<>();
		Queue<String> arrayDeque=new ArrayDeque<>();
		
		priority.add("Apple");
		priority.add("cat");
		priority.add("ball");
		priority.add("dog");
		priority.add("cat");
		
		
		arrayDeque.add("Apple");
		arrayDeque.add("cat");
		arrayDeque.add("ball");
		arrayDeque.add("dog");
		arrayDeque.add("cat");
		
		System.out.println(priority);
		System.out.println(arrayDeque);
		
		
	}
}
