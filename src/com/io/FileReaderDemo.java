package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {

		File file=new File("D://FileWriter.txt");
		try(FileReader fin=new FileReader(file)){
			int read;
			read=fin.read();
			while(read!=-1){
				System.out.print((char)read);
				read=fin.read();
			}		
			fin.close();
		}catch (IOException e) {
			e.getStackTrace();
		}
	}
}
