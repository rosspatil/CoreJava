
public class Palidrome {

	

	private static void check(int i, int j) {
		int flag=0;
		String str=String.valueOf(i*j);
		for(int m=0,n=str.length()-1;m<str.length();m++,n--){
			if(str.charAt(m)!=str.charAt(n)){
				flag=1;
			}
		}
		if(flag==0){
			System.out.println(str);
		}
	}
	
public static void main(String[] args) {
		for (int i = 101; i <=999; i++) {
			for (int j = 101; j <=999; j++) {
				check(i,j);
			}
		}
		
	}
}
