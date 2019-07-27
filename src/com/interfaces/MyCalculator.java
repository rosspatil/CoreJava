package com.interfaces;

public class MyCalculator implements Calculator,Advcalculator
{
	@Override
    public int add(int a,int b)
    {
    	return a+b;
    }
	@Override
    public int sub(int a,int b)
    {
    	return a-b;
    }
	@Override
    public float mul(float a,float b)
    {
    	return a*b;
    }
	@Override
    public float div(float a,float b)
    {
    	return a/b;
    }
}
