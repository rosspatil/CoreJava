package com.threading;


class MyThread4 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
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

public class Demo4 {
	public static void main(String[] args) throws InterruptedException {
		MyThread4 t1=new MyThread4();
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");	
			Thread.sleep(1000);
		}
	}
}

