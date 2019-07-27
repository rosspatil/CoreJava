package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {

	public static void main(String[] args) {
		File file=new File("D://BuffereWriter.txt");
		try(java.io.BufferedReader bin=new java.io.BufferedReader(new FileReader(file))){
			
			String line;
			line=bin.readLine();
			while(line!=null){
				System.out.println(line);
				line=bin.readLine();
			}
			bin.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
