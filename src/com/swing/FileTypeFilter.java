package com.swing;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileTypeFilter extends FileFilter {

	public final String description;
	public final String extension;
	
	
	public FileTypeFilter(String description, String extension) {
		this.description = description;
		this.extension = extension;
	}

	@Override
	public boolean accept(File f) {
		if(f.isDirectory()){
			return true;
		}
		return f.getName().endsWith(extension);
	}

	@Override
	public String getDescription() {
		return description+String.format("(*%s)",extension);
	}

}
