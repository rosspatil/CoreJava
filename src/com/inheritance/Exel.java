package com.inheritance;

class Exel extends Document{

	 @Override
	 public void open()
	 {
		 System.out.println("Exel is open...");
	
	 }
	 @Override
	 public void save()
	 {
		 System.out.println("Saving Exel...");
	 }
     @Override
	 public void close()
	 {
		 System.out.println("Closing Exel...");
	 }
     
     public void addSheet()
     {
    	 System.out.println("Adding Sheet.....");
     }
}
