import java.util.Scanner;


public class library {
	String nm;
	String author;
	Float price;
	Integer stock;
	
	public library()
	{
		nm="abc";
		author="xyz";
		price=0.0f;
		stock=0;
	}
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		
		System.out.println("Name of book:");
		nm=sc.next();
		System.out.println("Name of author:");
		author=sc.next();
		System.out.println("price of book:");
		price=sc.nextFloat();
		System.out.println("Stock:");
		stock=sc.nextInt();
	}
	
	public void showdata()
	{
		System.out.println("Name of book:"+nm);
		System.out.println("Name of author:"+author);
		System.out.println("price of book:"+price);
		System.out.println("Stock:"+stock);		
	}
	public void update()
	{
		int stk;
		System.out.println("Enter new stock:");
		stk=sc.nextInt();
		stock=stock+stk;
		System.out.println("new stock= "+stock);
		
	}
 public static void main(String[] args) {
	int ch;
	library l1;
	char ans;
	l1=new library();
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("1.Accept book details");
		System.out.println("2.display book details");
		System.out.println("3.update stock");
		
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1: l1.accept();
		break;
		case 2: l1.showdata();
		break;
		case 3:l1.update();
		break;
		}
    System.out.println("Do you want to continue:");
    ans=sc.next().charAt(0);
	}while(ans=='y'||ans=='Y');
	sc.close();
	
	
  }
}
