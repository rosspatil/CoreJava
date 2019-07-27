package com.exception;

public class Custm2 extends RuntimeException {
	static void one() throws Custm2{
		two();
	}
	static void two() throws Custm2{
		System.out.println(1/0);
	}
	public static void main(String[] args) {
		try{
			one();	
		}catch(Custm2 c)
		{
			System.out.println(c.getMessage());
		}
	}
}
