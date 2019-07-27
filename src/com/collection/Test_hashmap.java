package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test_hashmap {

	public static void main(String[] args) {
		/*HashMap<Integer, Integer> h=new HashMap<Integer,Integer>();
		
		h.put(1, 100);
		h.put(2, 200);
		
		Set<Map.Entry<Integer, Integer>> a=h.entrySet();
		
		for (Map.Entry<Integer, Integer> entry : a) {
			System.out.println(entry.getKey());
			
		}*/
		
		
		/*TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		
		t.put(2, "abc");
		t.put(1, "pqr");
		
		Set<Map.Entry<Integer,String>> a=t.entrySet();
		for (Map.Entry<Integer, String> entry : a) {
			System.out.println(entry);
		}*/
		
		TreeMap t=new TreeMap();
		
		t.put("abc","ppp");
		t.put("pqr",3.44f);
		t.put("abd",4);
		//System.out.println(t.hashCode());
		
		Set<Map.Entry> a=t.entrySet();
		for (Map.Entry entry : a) {
			System.out.println(entry);
		}
	}
}
