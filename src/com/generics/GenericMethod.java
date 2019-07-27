package com.generics;


public class GenericMethod<T> {
	
	public static <T> void Print(T[] list){
		for (T t : list) {
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		Integer[] integ={1,2,3,4,5};
		String[] str={"A","B","C","D"};
		
		Print(integ);
		Print(str);
	}

}
