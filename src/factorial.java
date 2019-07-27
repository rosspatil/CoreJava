import java.util.Scanner;
public class factorial {
	public static void main(String s[])
	{
		int i,n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		n=sc.nextInt();
		for(i=n ;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		sc.close();
	}

}
