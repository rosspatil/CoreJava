package com.interfaces;

interface IStack {
	public void push(String value);
	public String pop();
}

class MyStack implements IStack {

	String values[];
	int tos=-1;
	
	MyStack(int size) {
		values=new String[size];
	}
	
	@Override
	public void push(String value) {
		values[++tos]=value;
	}

	@Override
	public String pop() {
		String value=values[tos--];
		return value;
	}
}


public class Test_Stack {

	public static void main(String[] args) {
		MyStack st=new MyStack(5);
       st.push("abc");
       st.push("pqr");
       st.push("xyz");
       st.push("lmn");
       
       System.out.println(st.pop());
       System.out.println(st.pop());
       
  	}
}
