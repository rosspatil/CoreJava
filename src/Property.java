import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;


public class Property {

	public static void main(String[] args) throws IOException {
		Properties pro=System.getProperties();
		Enumeration p=pro.elements();
		while (p.hasMoreElements()) {
			Object object = (Object) p.nextElement();
			System.out.println(object.toString());
		}
		
		
		
	}
	
}
