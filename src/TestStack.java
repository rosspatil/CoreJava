import java.util.Scanner;


public class TestStack {
	static Scanner sc=new Scanner(System.in);
	static int tos=-1;
	public static int n;
	static String	item[]=new String[1];
	static void push(String str){		
		item[tos++]=str;
		
		
	}
	static void pop(){	
		System.out.println(tos);
			tos--;	
	}
	
	public static void main(String[] args) {
		System.out.println(tos);
		push("roshan");
		
	}

}
