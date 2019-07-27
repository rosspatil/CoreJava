class A {

	
	public static int return1(){
		return 1;
	}
	
	public static void process1(int input){
		System.out.println(input);
	}
	
	public static void main(String[] args) {
		
		process1(return1());
		
	}
}