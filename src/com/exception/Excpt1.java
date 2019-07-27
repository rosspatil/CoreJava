package com.exception;

public class Excpt1 {
	static void one(){
		two();
	}
	static void two(){
		System.out.println(1/0);
	}
	public static void main(String[] args) {
		one();
	}
}
