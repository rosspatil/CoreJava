package com.inheritance;

class Powerpoint extends Document {
	 @Override
	 public void open()
	 {
		 System.out.println("Powerpoint is open...");
	
	 }
	 @Override
	 public void save()
	 {
		 System.out.println("Saving powerpoint...");
	 }
     @Override
	 public void close()
	 {
		 System.out.println("Closing powerpoint...");
	 }
     
     public void addSlide()
     {
    	 System.out.println("Adding Slide.....");
     }

}
