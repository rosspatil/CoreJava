package com.assertion;
					
public class Assert1 {

	static boolean isValid(int age){
		assert age>0 && age<100:"Enter Age is not valid "+age;
		if(age>60){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isValid(190));
	}
}
