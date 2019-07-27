package com.threading;
class Test extends Thread {
	private int num;
	private boolean isComplete;
	private int result;
	public Test(int num) { this.num = num; }
	public synchronized void run() {
		result = num * 2;
		isComplete = true;
		notify();
	}

	public synchronized int getResult() {
		while (!isComplete) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		return result;
	}
	public static void main(String[] args) {
		Test[] computations = new Test [4];
		for (int i = 0; i < computations.length; i++) {
			computations[i] = new Test(i);
			computations[i] .start();
		}
		for (Test c : computations)
			System.out.print(c.getResult() );
	}
}
