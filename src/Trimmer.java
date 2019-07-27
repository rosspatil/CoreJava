import java.util.StringTokenizer;
public class Trimmer {
	static String str=new String("roshan patil");
	public static void main(String[] args) {
			StringTokenizer st=new StringTokenizer("Name=Roshan patil","=");
			System.out.println(st.countTokens());
			while (st.hasMoreElements()) {
				System.out.println(st.nextToken());
				
			}
		
	}

}
