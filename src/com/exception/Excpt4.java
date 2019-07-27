package com.exception;

public class Excpt4 {
	static void one()throws ArithmeticException{
		two();
	}
	static void two() throws ArithmeticException{
		System.out.println(1/0);
	}
	public static void main(String[] args) {
		try{
			one();
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Finally");
		}
	}
}
