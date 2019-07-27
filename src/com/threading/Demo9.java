package com.threading;

class Display1{	
	public  static synchronized void show(String name) throws InterruptedException{
		for (int i = 0; i < 10; i++) {
			System.out.println("wait for "+(10-i));
			Thread.sleep(1000);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
			Thread.sleep(1000);
		}		
	}
}

class MyThread9 extends Thread{
	Display1 d;
	String name;
	public MyThread9(Display1 d,String name) {
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

public class Demo9 {
	public static void main(String[] args) {
		Display1 d1=new Display1();
		Display1 d2=new Display1();
		MyThread9 t1=new MyThread9(d1,"roshan");
		MyThread9 t2=new MyThread9(d2,"Lokesh");
		t1.start();
		t2.start();
	}
}

