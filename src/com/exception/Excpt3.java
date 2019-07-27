package com.exception;

public class Excpt3 {
	static void one(){
		try{
			two();			
		}catch(ArithmeticException e){
			System.err.println(e.getMessage());
		}

	}
	static void two(){
		throw new ArithmeticException("Roshan exception");
	}
	public static void main(String[] args) {
		one();
	}
}
