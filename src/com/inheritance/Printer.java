package com.inheritance;

public class Printer {

	static int wcount;
	static int pcount;
	static int ecount;
	
	public static int print(Word w)
	{
		System.out.println("Printing word..");
	    return wcount++;
	}
	
	public static int print(Powerpoint p)
	{
		System.out.println("Printing powerpoint..");
	     return pcount++;
	}
	
	public static int print(Exel e)
	{
		System.out.println("Printing Exel..");
	     return ecount++;
	}
}
