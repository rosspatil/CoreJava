package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
	public static void main(String[] args) {
		Set<String> sorted=new HashSet<>();
		Set<String> linked=new LinkedHashSet<>();
		Set<String> tree=new TreeSet<>();
		
		sorted.add("six");
		sorted.add("one");
		sorted.add("one");
		sorted.add("nine");
		sorted.add("eight");
		
		linked.add("one");
		linked.add("one");
		linked.add("nine");
		linked.add("Eight");
		
		tree.add("six");
		tree.add("one");
		tree.add("one");
		tree.add("nine");
		tree.add("eight");
		
		
		
		System.out.println(sorted);
		System.out.println(linked);
		System.out.println(tree);
	}
}
