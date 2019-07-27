package com.io;

import java.io.*;


public class FileCopy {
	
	public static void main(String[] args) {
		String file1="E:\\How to learn English speaking easily.mp4";
		String file2="E:\\mszs1.mp4";
		
		try(BufferedInputStream bufin=new BufferedInputStream(new FileInputStream(file1));
				BufferedOutputStream bufout=new BufferedOutputStream(new FileOutputStream(file2)))
				{
			     int read;
			     while((read=bufin.read())!=-1){
			    	System.out.print(read);
			    	bufout.write(read);
			     }
					bufout.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

		
}