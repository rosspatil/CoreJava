package com.inheritance;

import java.util.Scanner;

class Circle extends Shape 
{

	float r;
	final float pi=3.14f;
	float area;
	
	Circle()
	{
		r=0.0f;
		area=0.0f;
	}
	@Override
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		r=sc.nextFloat();
		sc.close();
	}
    @Override
	public float area()
	{
		area=2*pi*r;
		return area;
	}
    @Override
	public void draw()
	{
		System.out.println("Drawing circle..");
	}
}
