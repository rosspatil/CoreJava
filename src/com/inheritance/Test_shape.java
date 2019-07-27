package com.inheritance;



public class Test_shape {

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r= new Rectangle();
		Shape shape[]={c,r};
		
		for(Shape Shape:shape)
		{
			Shape.accept();
			System.out.println("Area : "+Shape.area());
            Shape.draw();
		}
		
	}
	

}
