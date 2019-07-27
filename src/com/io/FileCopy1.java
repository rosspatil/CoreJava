package com.io;

import java.io.*;


public class FileCopy1 implements Runnable{
	String file1="E:\\mszs.txt";
	String file2="E:\\mszs1.txt";
	BufferedInputStream bufin;
	BufferedOutputStream bufout;
	
	FileCopy1(){
		new Thread(this).start();
	}
	public static void main(String[] args)  {

		new FileCopy1();
		
	}

	@Override
	public void run() {
		try {
			StringBuffer src=new StringBuffer();;
			
			bufin=new BufferedInputStream(new FileInputStream(file1));
			bufout=new BufferedOutputStream(new FileOutputStream(file2));
			while((bufin.read())!=-1){
				src.append((char)bufin.read());
			}
			System.out.println(src);
			bufin.close();
			bufout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}