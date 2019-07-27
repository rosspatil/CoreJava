package com.inheritance;

public class Test_Document {
	public static void main(String[] args) {
		Word w=new Word();
		Powerpoint p=new Powerpoint();
		Exel e=new Exel();
		
		Document doc[]={w,p,e};
		
		for(Document Doc:doc)
		{
			Doc.open();
			Doc.save();
			Doc.close();
		}
		w.addPage();
		p.addSlide();
		e.addSheet();
		
		Printer.print(w);
		Printer.print(e);
		Printer.print(p);
		

		System.out.println("Printing count.."+Printer.print(w));
		System.out.println("Printing count.."+Printer.print(e));
		System.out.println("Printing count.."+Printer.print(p));
		
			
	}
}
