package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
	
		try {
			FileInputStream fi=new FileInputStream("dummy.properties");
			Properties properties=new Properties();
			properties.load(fi);
			System.out.println(properties.getProperty("OS"));
			System.out.println(properties.getProperty("Host"));
			System.out.println(properties.getProperty("Server"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
