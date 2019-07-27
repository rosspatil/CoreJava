import java.util.Scanner;



class rect {
	int length,breadth;
	
	rect()
	{
		length=0;
		breadth=0;
	}
	Scanner sc =new Scanner(System.in);
	public void getinput()
	{
		
		System.out.println("Enter length");
		length=sc.nextInt();
		System.out.println("Enter breadth");
		breadth=sc.nextInt();
				
	}
	public void area()
	{
		int area;
		area=length*breadth;
        System.out.println("Area: "+area);		
	}
}
class square {
	int side;
	
	square()
	{
		side=0;
	}
	Scanner sc =new Scanner(System.in);
	public void getinput()
	{
	
		System.out.println("Enter side");
		side=sc.nextInt();
	}
	public void area()
	{
		int area;
		area=side*side;
        System.out.println("Area: "+area);		
	}
	
}
class circle {
float radius;
final float pi=3.14f;
	
	circle()
	{
		radius=0.0f;
	}
	Scanner sc =new Scanner(System.in);
	public void getinput()
	{
		
		System.out.println("Enter radius");
		radius=sc.nextFloat();
	}
	public void area()
	{
		float area;
		area=radius*radius*pi;
        System.out.println("Area: "+area);		
	}
	
	
}
 class tri{
	int base,height;
			
		tri()
		{
			base=0;
			height=0;
		}
		Scanner sc =new Scanner(System.in);
		public void getinput()
		{
			
			System.out.println("Enter base");
			base=sc.nextInt();
			System.out.println("Enter height");
			height=sc.nextInt();
		}
		public void area()
		{
			float area;
			area=0.5f*base*height;
	        System.out.println("Area: "+area);		
		}
		
		
	}
 public class shape {

	 public static void main(String[] args) {
	 		 	
	 	rect r=new rect();
	 	tri t=new tri();
	 	square s=new square();
	 	circle c=new circle();
	 	Scanner sc=new Scanner(System.in);
	 	int ch;
	 	char ans;
	 	do
	 	{
	 		System.out.println("1.Area of rectangle");
		 	System.out.println("2.Area of square");
		 	System.out.println("3.Area of triangle");
		 	System.out.println("4.Area of circle");
		 	System.out.println("Enter your choice..");
		 	ch=sc.nextInt();
		 	switch(ch)
		 	{
		 	case 1:r.getinput();
		 	r.area();
		 	break;
		 	case 2: s.getinput();
		 	s.area();
		 	break;
		 	case 3:
		 		t.getinput();
			 	t.area();
			 	break;
		 	case 4:c.getinput();
		 	c.area();
		 	break;
		 	}
		 	System.out.println("Do you want to continue..");
		 	ans=sc.next().charAt(0);
		 	 	
		 	 	}while(ans=='y'||ans=='Y');
	 	sc.close();
	 	
	 }

	 }