import java.util.Scanner;


public class product {
	
	
	 public static void main(String[] args)
	 {
		 prod p[]=new prod[3];
		 Scanner sc=new Scanner(System.in);
		 int total=0;
	
		 System.out.println("Enter name of customer:");
			String name=sc.next();
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter mobile no: ");
			Long mob=sc.nextLong();

		 for(int i=0;i<3;i++)
		 {
			
				p[i]=new prod();
				System.out.println("Enter product name:");
				p[i].setPname(sc.next());
				System.out.println("Enter product price:");
				p[i].setPrice(sc.nextInt());
				System.out.println("Enter quantity of product:");
				p[i].setQty(sc.nextInt());
				total=total+p[i].total();
		 }
		

		    System.out.println("---------- CUSTOMER INFO ----------");
			System.out.println("ID \t Name \t Mobile no");
			System.out.println(""+id+"\t "+name+"\t "+mob);
			
			System.out.println("---------- PRODUCT INFO ----------");
			System.out.println("Name \t Price \t QTY \t Total");
			
			for(int i=0;i<3;i++)
			{
			
				System.out.println(""+p[i].getPname()+"\t "+p[i].getPrice()+"\t "+p[i].getQty()+"\t "+p[i].total());
				
							
			}	
			
			System.out.println("------------------------------------");
			System.out.println("\t\t\t\t"+total);
			sc.close();
	}

	}
	  
		