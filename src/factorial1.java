
public class factorial1 {
	int fact(int n) {
		int result;
		if(n==1)
			return 1;
		result=fact(n-1)*n;
		return result;
	}

	public static void main(String[] args) {
		factorial1 f=new factorial1();
		int result=f.fact(5);
		System.out.println(result);
	}
}
