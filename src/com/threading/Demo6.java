package com.threading;


class MyThread6 extends Thread{
	static Thread t1;
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				t1.join();
				System.out.println("Child thread");	
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
					
		}
	}
}

public class Demo6 {
	public static void main(String[] args) throws InterruptedException {
		MyThread6.t1=Thread.currentThread();
		MyThread6 t1=new MyThread6();
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Main thread");	
			Thread.sleep(1000);
		}
	}
}

