
public class Concate {

	public static void main(String[] args) {
		char[] ch1={'r','o','s'};
		char[] ch2={'h','a','n'};
		int cnt=0;
		char[] res=new char[(ch1.length+ch2.length)];
		for (int i = 0; i < ch1.length; i++) {
		    	res[i]=ch1[i];
			    cnt++;
		    }
		for (int i = 0; i < ch2.length; i++) {
			    res[i+cnt]=ch2[i];						  
		}
		System.out.println(cnt);
		System.err.println(res);
	}
}
