package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class RandomAccess {

	public static void main(String[] args)  {
		RandomAccess r=new RandomAccess();
		try(RandomAccessFile f=new RandomAccessFile(new File("D:\\StudentResult1.txt"), "rw")){
			
			f.writeBytes("roshan");
			while(f.read()!=-1){
				System.out.print((char)f.read());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
	}
}
