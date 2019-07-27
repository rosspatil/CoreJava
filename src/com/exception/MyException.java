package com.exception;

public class MyException {
	public static int divide(int num1, int num2) throws DivideByZeroException {
		if(num2<=0) throw new DivideByZeroException("Can not divide by zero...");
		return num1/num2;
	}
	public static void main(String[] args) {
		int no1, no2, result;
		no1=no2=result=0;

		System.out.println("MyException...");

		try {
			no1=Integer.parseInt(args[0]);
			no2=Integer.parseInt(args[1]);

			result=divide(no1, no2);

			System.out.println("Result:"+result);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("Enter 2 arguments...");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch(NumberFormatException ex) {
			System.err.println("Enter 2 numeric arguments");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch(ArithmeticException ex) {
			System.err.println("Enter 2 non zero numeric arguments");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		} 
		catch(DivideByZeroException ex) {
			System.err.println("Enter 2 non zero numeric arguments");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		} 
		catch(Exception ex) {
			System.err.println("General error occured");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("ended...");
	}
	public static void main1(String[] args) {
		int no1, no2, result;
		no1=no2=result=0;

		System.out.println("MyException...");

		try {
			no1=Integer.parseInt(args[0]);
			no2=Integer.parseInt(args[1]);

			result=no1/no2;

			System.out.println("Result:"+result);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("Enter 2 arguments...");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch(NumberFormatException ex) {
			System.err.println("Enter 2 numeric arguments");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		/*catch(ArithmeticException ex) {
			System.err.println("Enter 2 non zero numeric arguments");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		} */
		catch(Exception ex) {
			System.err.println("General error occured");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("ended...");
	}

}


class DivideByZeroException extends Exception {
	
	public DivideByZeroException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "DivideByzero->"+super.getMessage();
	}
}