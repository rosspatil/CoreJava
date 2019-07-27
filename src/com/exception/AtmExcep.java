package com.exception;

import java.util.Scanner;



class AtmExcep {

	long amt;

	public AtmExcep() {
	amt=50000;
	}


	Scanner sc= new Scanner(System.in);


	public  void withdraw() 

	{
	long wamt=0;
	System.out.println("Enter withdraw amount : ");
	wamt=sc.nextLong();
	try
	{
		if((wamt%100)!=0)
		{
			throw new CheckAmtException("Withdraw amount should be in multiple of 100");
		}
		else if(wamt>amt)
		{
			throw new CheckAmtException("Not having enough cash..");
		}
		else if(wamt>10000)
		{
			throw new CheckAmtException("Withdraw amount should less than 10000..");
		}
		else
		{
			System.out.println("Transaction is done..");
		}
	}
	catch(CheckAmtException ex)
	{
		System.err.println(ex.getMessage());
	}
	
	
	
}
	public static void main(String[] args) {
		AtmExcep a=new AtmExcep();
		a.withdraw();
	}
}

class CheckAmtException extends Exception
{
	public CheckAmtException(String msg)
	{
		super(msg);
	}
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
