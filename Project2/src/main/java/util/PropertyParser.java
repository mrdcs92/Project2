package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyParser {

	private static PropertyParser propertyParser;
	
	public static PropertyParser getPropertyParser() {
		if (propertyParser == null) {
			propertyParser = new PropertyParser();
		}
		return propertyParser;
	}
	
	public static String getProp(String myProp) {
		String desiredProp = "";
		
		try {
			
			Properties props = new Properties();
			FileInputStream in;
			in = new FileInputStream("C:\\Users\\brianrembecky\\Documents\\Project2\\Project2\\Project2\\src\\main\\resources\\chromedriver.exe");
			props.load(in);
			desiredProp += props.getProperty(myProp);
			
		} catch (FileNotFoundException e) {
			System.out.println("resource not found bleh");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO whatever bleh");
			e.printStackTrace();
		}
		
		return desiredProp;
	}
	
}
