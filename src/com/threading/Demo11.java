package com.threading;

class Display3{	
	public   void show(String name) throws InterruptedException{
		for (int i = 0; i < 5; i++) {
			System.out.println("wait for "+(5-i));
			Thread.sleep(1000);
		}
		synchronized (Display3.class) {
			for (int i = 0; i < 10; i++) {
				System.out.println(name);
				Thread.sleep(1000);
			}
		}		
	}
}

class MyThread11 extends Thread{
	Display3 d;
	String name;
	public MyThread11(Display3 d,String name) {
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

public class Demo11 {
	public static void main(String[] args) throws InterruptedException {
		Display3 d1=new Display3();
		Display3 d2=new Display3();
		MyThread11 t1=new MyThread11(d1,"roshan");
		MyThread11 t2=new MyThread11(d2,"Lokesh");
		t1.start();
		t2.start();
		
	}
}

