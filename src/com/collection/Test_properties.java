package com.collection;

import java.util.Properties;

public class Test_properties {

	public static void main(String[] args) {
		Properties p=new Properties();
		
		p.setProperty("abc", "pqr");
		
		System.out.println(p);
		
		System.out.println(p.getProperty("abc"));
		
	}
}
