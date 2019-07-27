package com.threading;

import java.util.Scanner;


class Thr extends Thread{
	public  volatile boolean  running;
	@Override
	public void run() {
		running=true;

		while(running){
			if(Thread.currentThread().getName().equals("1"))
			{
				System.out.println("child thread");
			}
			if(Thread.currentThread().getName().equals("2"))
			{
				System.out.println("parent thread");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}	
	synchronized void  shutdown(){
		System.out.println("shutdown called");
		running=false;
	}
}
public class VolatileDemo {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Thr v=new Thr();
		v.setName("1");
		Thr v1=new Thr();
		v1.setName("2");
		v.start();
		v1.start();


		System.out.println("preess key...");
		sc.nextLine();
		v1.shutdown();


	}
}
