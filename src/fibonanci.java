import java.util.Scanner;
public class fibonanci {

	
	    public static void main(String arg[]){
	    
	    int a=0,b=1,c,i,n;
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number for series");
	    n=sc.nextInt();
	    System.out.println(b);
	    for (i= 0; i < n; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	    sc.close();
	}


}
