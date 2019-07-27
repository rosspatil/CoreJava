package com.threading;

class Display{	
	public  synchronized void show(String name) throws InterruptedException{
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
			Thread.sleep(1000);
		}		
	}
}

class MyThread8 extends Thread{
	Display d;
	String name;
	public MyThread8(Display d,String name) {
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

public class Demo8 {
	public static void main(String[] args) {
		Display d=new Display();
		MyThread8 t1=new MyThread8(d,"roshan");
		MyThread8 t2=new MyThread8(d,"Lokesh");
		t1.start();
		t2.start();
	}
}

