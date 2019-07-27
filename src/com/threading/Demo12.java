package com.threading;

import java.util.Stack;

class Producer extends Thread{
	Stack<Integer> stack=new Stack<>();
	public void push(int i) throws InterruptedException{
		System.out.println("pushed "+i);
		stack.push(i);
		Thread.sleep(1000);
	}	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				push(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Consumer extends Thread{
	static Thread t;
	Stack<Integer> stack;
	public Consumer(Stack<Integer> stack) {
		this.stack=stack;
	}
	public int pop(){
		return stack.pop();
		
	}	
	@Override
	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("poped "+pop());
		}
		
		
	}
}


public class Demo12 {
	
	public static void main(String[] args) throws InterruptedException {
		Producer p=new Producer();
		Consumer c=new Consumer(p.stack);
		Consumer.t=p;
		p.start();
		c.start();
		
		
	}

}
