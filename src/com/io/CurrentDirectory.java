package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CurrentDirectory {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File(".");
		System.out.println(file.getAbsolutePath());
		
		
	}
}
