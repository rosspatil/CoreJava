
public class ArmstrongNumber {

	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<=9;i++){
			for(j=0;j<=9;j++){
				for(k=0;k<=9;k++){
					if((i*i*i+j*j*j+k*k*k)==i*100+j*10+k){
						System.out.println(i+"\t"+j+"\t"+k);
					}
				}
			}
		}
	}
}
