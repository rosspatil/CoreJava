package com.exception;

public class Custm3 extends RuntimeException {
	static void one()throws Custm1{ 
		two();
	}
	static void two(){
		throw new Custm1("Roshan patil");
	}
	public static void main(String[] args) {
		try{
			one();	
		}catch(Custm3 c)
		{
			System.out.println(c);
		}
	}
}
