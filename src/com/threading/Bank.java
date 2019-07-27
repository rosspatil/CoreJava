package com.threading;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account{
	long bal;
	public Account(long bal) {
		this.bal=bal;
	}
	Lock lock=new ReentrantLock();
	public long getBal() {
		return bal;
	}

	public void setBal(long bal) {
		this.bal = bal;
	}

}




public class Bank extends Thread{

	Account acc;

	Scanner sc=new Scanner(System.in);

	public Bank(Account acc,String name) {
		super(name);
		this.acc=acc;

	}

	void withDraw(long money){
		try{
			acc.lock.lock();


			long bal=acc.getBal();
			bal=bal-money;
			acc.setBal(bal);
			System.out.println("Remaining balance after withdraw: "+acc.getBal());	


		}finally{
			acc.lock.unlock();
		}
	}
	void deposite(long money) throws InterruptedException{
		try{
			acc.lock.lock();


			long bal=acc.getBal();
			bal=bal+money;
			acc.setBal(bal);

			System.out.println("Balance After Deposite: "+acc.getBal());

		}finally{
			acc.lock.unlock();
		}
	}

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("one")){

			withDraw(10);
		}else if(Thread.currentThread().getName().equals("two")){

			try {
				deposite(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Account acc=new Account(100);
		Bank b1=new Bank(acc,"one");
		Bank b2=new Bank(acc, "two");
		Bank b3=new Bank(acc, "two");
		Bank b4=new Bank(acc, "two");
		b1.start();
		b2.start();
		b3.start();
		b4.start();


		Thread.sleep(2000);
		System.out.println("\n\n\n\n Balance :" +acc.getBal());
	}

}
