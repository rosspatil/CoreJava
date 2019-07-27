package com.threading;


class MyThread1 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");			
		}
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Thread t1=new Thread(new MyThread1());
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");			
		}
	}
}

