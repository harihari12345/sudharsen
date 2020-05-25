package firstProject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configproperties {
	
	static Properties prop;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("D:\\JavaExample\\firstProject\\src\\firstProject1\\configprop");
				
		try
		{
			prop.load(ip);
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
		
		String url= prop.getProperty("URL");
		System.out.println(url);
		
		
		
		
	}

}
