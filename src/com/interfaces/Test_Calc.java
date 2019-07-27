package com.interfaces;

public class Test_Calc {

	public static void main(String[] args) {
		
		MyCalculator m=new MyCalculator();
		Calculator c=m;
		Advcalculator advcalc=m;
		
		System.out.println("Additio  is "+m.add(10,5));
		System.out.println("Subtraction is "+m.sub(10, 5));
		System.out.println("Multiplication is"+m.mul(10.0f, 5.0f));
		System.out.println("Division is "+m.div(10.0f, 5.0f));
		
		System.out.println("Additio  is "+c.add(10,5));
		System.out.println("Subtraction is "+c.sub(10, 5));
		System.out.println("Multiplication is"+advcalc.mul(10.0f, 5.0f));
		System.out.println("Division is "+advcalc.div(10.0f, 5.0f));
		
	}
}
