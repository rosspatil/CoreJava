package com.exception;


public class Excep {
/*int l,b,area;
public static int area(int l,int b)throws Exception
{
	if(l==0||b==0)
	{
		throw new Exception("Length and breadth should be greater than zero.. ");
	}
	return l*b;
}*/
public static void main(String[] args) {
	int l,b,area;
	l=b=area=-1;
	
 try
 {
	 l=Integer.parseInt(args[0]);
	 b=Integer.parseInt(args[1]);
	 if(l==0||b==0)
		 throw new Exception("Length and Breadth should be greater than zero..");
	 else
		 area=l*b;
	     System.out.println("Area of rectangle is : "+area);
	
 }
 catch(NumberFormatException ex)
 {
	 System.err.println("Type mismatch.....");
 }
 catch(Exception ex)
 {
	 System.err.println(ex.getMessage());
 }
}
}
