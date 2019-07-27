package com.varArgs;

public class varArgsDemo {
	public static void add(String name,int... x){
		int a=0;
		for (int i : x) {
			a+=i;
		}
		System.out.println("name:" + name);
		System.out.println(a);
	}
	public static void main(String ...args) {
		add("roshan",1,2,3,4);
	}

}
