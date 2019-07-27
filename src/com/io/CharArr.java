package com.io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArr {
public static void main(String[] args) throws IOException {
	char c[]={'a','b','c'};
	CharArrayReader cr=new CharArrayReader(c);
	CharArrayWriter cw=new CharArrayWriter();
	int i;
	do {
		i=cr.read();
		cw.write(i);
		System.out.println((char)i);
	} while (i!=-1);
	cw.append('j');
	System.out.println(cw);

}
}
