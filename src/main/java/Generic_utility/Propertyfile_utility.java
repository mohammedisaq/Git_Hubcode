package Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyfile_utility {
	
	public String Readdata_propertyfile(String key) throws Throwable {
		FileInputStream fisp=new FileInputStream(".\\src\\test\\resources\\Login_Credentials.Properties");
		Properties p=new Properties();
		p.load(fisp);
		String value = p.getProperty(key);
		return value;
	}

}
