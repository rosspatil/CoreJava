package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		File file=new File("D://PrintWriter.txt");
		try(PrintWriter pout=new PrintWriter(file)){
			
			pout.println("Roshan Patil");
			pout.println("Roll:01");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
