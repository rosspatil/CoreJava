package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {
	public static void main(String[] args) {

		File file=new File("D://BuffereWriter.txt");
		try(BufferedWriter bout=new BufferedWriter(new FileWriter(file))){
			bout.write("Roshan patil");
			bout.newLine();bout.write("Roll:01");
			bout.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
