package com.threading;


class MyThread5 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Demo5 {
	public static void main(String[] args) throws InterruptedException {
		MyThread5 t1=new MyThread5();
		t1.start();
		t1.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");		
			Thread.sleep(1000);
		}
		
	}
}

