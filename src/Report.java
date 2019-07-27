import java.util.Scanner;

public class Report {
	Scanner sc=new Scanner(System.in);
	Whether w=new Whether();
	
	public void accept(int i) {
		
		w.setDom(i+1);
		System.out.print("\nhigh temp:");
		w.sethTemp(sc.nextInt());
		System.out.print("\nLow temp :");
		w.setlTemp(sc.nextInt());
		System.out.print("\nrain amt :");
		w.setRain(sc.nextInt());
		System.out.print("\nSnow amt :");
		w.setSnow(sc.nextInt());
	}
	
	public void display() {
		System.out.print("\n"+w.getDom()+"\t"+w.gethTemp()+"\t"+w.getlTemp()+"\t"+w.getRain()+"\t"+w.getSnow());
		System.out.print("\n------------------------------------");
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Report r[]=new Report[3];	
		int n;
		char ans;
		do {
			System.out.print("**** Whether Report *****");
			System.out.print("\n1.Enter Days Entries");
			System.out.print("\n2.Display details");
			System.out.print("\nEnter your chioice......: ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:			
				System.out.print("\nEnter no. of days: ");
				n=sc.nextInt();
				for (int i = 0; i < n; i++) {
					r[i]=new Report();
					System.out.print("\nEnter details of "+(i+1)+" day:");
					r[i].accept(i);
				}
				break;
			case 2:
				System.out.println("\nDOM\tHTEMP\tLTEMP\tRAIN\tSNOW");
				System.out.print("\n------------------------------------");
				for (int i = 0; i <r.length; i++) {
					
					r[i].display();					
				}
				break;

			default:
				break;
			}
			System.out.print("\nD you want to continue? ");
			ans=sc.next().charAt(0);
		}while(ans=='y'||ans=='Y');
		sc.close();
	}
}
