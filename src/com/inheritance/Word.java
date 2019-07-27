package com.inheritance;

 class Word extends Document {
	 @Override
	 public void open()
	 {
		 System.out.println("Word is open...");
	
	 }
	 @Override
	 public void save()
	 {
		 System.out.println("Saving word...");
	 }
     @Override
	 public void close()
	 {
		 System.out.println("Closing word...");
	 }
     
     public void addPage()
     {
    	 System.out.println("Adding page.....");
     }

}
