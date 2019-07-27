package com.exception;

public class Excpt2 {
	static void one() throws InterruptedException{
		two();
	}
	static void two() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("hello");
	}
	public static void main(String[] args)  throws InterruptedException{
		one();
	}
}
