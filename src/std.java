import java.util.Scanner;
public class std {
	public static void main(String s[])
	{
		int rno,marks;
		String nm;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter how many entries you want to enter:");
		//n=sc.nextInt();
		System.out.println("Enter name of student:");
		nm=sc.next();
	    System.out.println("Enter roll no:");
		rno=sc.nextInt();
		System.out.println("Enter marks:");
		marks=sc.nextInt();
		
		System.out.println("name:");
		System.out.println(nm);
		System.out.println("Roll no:");
		System.out.println(rno);
		System.out.println("Marks:");
		System.out.println(marks);
				
			
	}
}
