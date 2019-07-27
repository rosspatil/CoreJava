import java.util.Scanner;
public class fibonnaci {
		public static void main(String s[])
		{
			int a=0,b=1,c,n,i;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of series");
			n=sc.nextInt();
			for(i=0;i<n;i++)
			{
					c=a+b;
					System.out.println(c);
					a=b;
					b=c;
				
			}
			sc.close();
			
		}

}
