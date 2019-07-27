package com.threading;


class MyThread3 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");			
		}
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		MyThread3 t1=new MyThread3();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("Child");
		System.out.println(t1.getName());
		t1.start();
		
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");			
		}
	}
}

