package com.threading;


class MyThread7 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {			
			try {
				System.out.println("Child thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Child Intrupted");
				Thread.currentThread().stop();
			}
		}
	}
}

public class Demo7 {
	public static void main(String[] args) throws InterruptedException {
		MyThread7 t1=new MyThread7();
		t1.start();
		t1.interrupt();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");		
			Thread.sleep(1000);
		}
		
	}
}

