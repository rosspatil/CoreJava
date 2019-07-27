package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		File file=new File("D://FileWriter.txt");
	 try(	FileWriter fout=new FileWriter(file, true)){
		 
		 fout.write("Roshan patil \n Roll:01");//it has problem of \n
		 
		 fout.close();
	 } catch (IOException e) {
		e.printStackTrace();
	}
	}

}
