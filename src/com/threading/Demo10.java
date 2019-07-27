package com.threading;

class Display2{	
	public   void show(String name) throws InterruptedException{
		for (int i = 0; i < 10; i++) {
			System.out.println("wait for "+(10-i));
			Thread.sleep(1000);
		}
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(name);
				Thread.sleep(1000);
			}
		}		
	}
}

class MyThread10 extends Thread{
	Display2 d;
	String name;
	public MyThread10(Display2 d,String name) {
		this.d=d;
		this.name=name;
	}
	@Override
	public void run() {
		try {
			d.show(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}

public class Demo10 {
	public static void main(String[] args) {
		Display2 d1=new Display2();
		MyThread10 t1=new MyThread10(d1,"roshan");
		MyThread10 t2=new MyThread10(d1,"Lokesh");
		t1.start();
		t2.start();
	}
}

