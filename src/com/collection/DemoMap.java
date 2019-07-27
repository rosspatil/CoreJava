package com.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
	public static void main(String[] args) {
		Map<Integer, String> hash=new HashMap<>();
		Map<Integer, String> tree=new TreeMap<>();
		Map<Integer, String> linked=new LinkedHashMap<>();
		Map<Integer, String> table=new Hashtable<>();

		hash.put(4, "four");
		hash.put(1, "one");
		hash.put(2, "two");
		hash.put(4, "four");

		tree.put(4, "four");
		tree.put(1, "one");
		tree.put(1, "one");
		tree.put(2, "two");


		linked.put(4, "four");
		linked.put(1, "one");
		linked.put(1, "one");
		linked.put(2, "two");


		table.put(1, "one");
		table.put(1, "one");
		table.put(2, "two");
		table.put(4, "four");

		System.out.println(hash);
		System.out.println(tree);
		System.out.println(linked);
		System.out.println(table);
	}

}

