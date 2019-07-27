package com.threading;

import java.util.Stack;

class Producer1 extends Thread{
	Stack<Integer> stack=new Stack<>();
	public synchronized void push(){
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("pushed "+i);
				stack.push(i);
//				notify();
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	}	

	@Override
	public void run() {
		push();
			
	}
}

class Consumer1 extends Thread{
	static Thread t;
	Stack<Integer> stack;
	public Consumer1(Stack<Integer> stack) {
		this.stack=stack;
	}
	public synchronized void pop() throws InterruptedException{
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("poped "+stack.pop());
			
		}

	}	
	@Override
	public void run() {	
		try {
			pop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
		Producer1 p=new Producer1();
		Consumer1 c=new Consumer1(p.stack);
		Consumer1.t=p;
		p.start();
		c.start();

//		p.join();
//		c.join();

	}

}
