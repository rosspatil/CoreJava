package com.inheritance;

import java.util.Scanner;

class Rectangle extends Shape {
	float l,b;
	float area;
	
	Rectangle()
	{
		l=0.0f;
		b=0.0f;
		area=0.0f;
	}
	@Override
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		l=sc.nextFloat();
		System.out.println("Enter breadth:");
		b=sc.nextFloat();
		sc.close();
	}
    @Override
	public float area()
	{
		area=l*b;
		return area;
	}
	@Override
	public void draw()
	{
		System.out.println("Drawing rectangle..");
	}
}
