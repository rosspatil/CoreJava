package com.io;

import java.io.File;
import java.io.FilenameFilter;

public class ListDirectoryRecursive1 {

	public static void main(String[] args) {

		File dir=new File("E:\\MY MUSIC");

		recursive(dir);


	}
	static void recursive(File dir) {


		if(dir.isDirectory()){
			String[] file=dir.list(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					if(dir.isDirectory()){
						return true;
					}

					return name.endsWith(".mp3");
				}
			}) ; 

			for (String files : file) {
				System.out.println(files);
				File fl=new File(files);
				if(fl.isDirectory()){
					recursive(fl);

				}

			}
		}
	}


}
