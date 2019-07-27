package com.string;

public class MyString {

	private char value[];
	
	public MyString(char[] value) {
		this.value=value;
	}
	
	public MyString(String string) {
		value=string.toCharArray();
	}
	
	public char charAt(int index) {
		return value[index];
	}
	public int length() {
		return value.length;
	}

	public boolean isEmpty() {
		return value.length==0;
	}
	
	@Override
	public String toString() {
		String string="";
		for(int index=0; index<value.length; index++) {
			string+=value[index];
		}
		return string;
	}
	
	public static void main(String[] args) {
		//MyString myString=new MyString("SEED Infotech".toCharArray());
		MyString myString=new MyString("SEED Infotech-Nashik");
		System.out.println(myString);
		System.out.println("charAt->"+myString.charAt(5));
		//VIT-Pune shifted to KKW
		
		String string="SEED Infotech-Nashik";
		System.out.println("charAt->"+string.charAt(5));
		
		System.out.println("concat:"+string.concat("JAVA Diploma"));
		
	}
}
