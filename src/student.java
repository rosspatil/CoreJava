



public  class student{
	String dt(){
		StringBuffer buf=new StringBuffer("123456789");
		buf.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
		return buf.toString();
	}
	public static void main(String[] args) throws Error{
		
     student t=new student();
     System.out.println(t.dt());
		
	}
}