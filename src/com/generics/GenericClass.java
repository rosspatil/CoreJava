package com.generics;

import java.io.Serializable;
import java.util.Comparator;

public class GenericClass <T extends Comparable<T>>{
	public T a,b;
	public GenericClass(T a,T b) {
		this.a=a;
		this.b=b;
	}
	public T getValueA(){
		return a;
	}
	public T getValueB(){
		return b;
	}
	
	public static void main(String[] args) {
		GenericClass<Float> gc=new GenericClass<Float>(300.00F, 200.00F);
		System.out.println(gc.getValueA());
		System.out.println(gc.getValueB());
	}
}
