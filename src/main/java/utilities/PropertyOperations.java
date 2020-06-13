package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyOperations {
	
	static File propFile = new File(System.getProperty("user.dir")+"/src/test/resources/config.properties");
	static Properties prop = new Properties();
	
	public static String getPropertiesFileData(String key) throws Exception {
		FileInputStream fis = new FileInputStream(propFile);
		//load
		prop.load(fis);
		//read data			
		String value = prop.getProperty(key);
		
		if(value.isEmpty() || value == " ") {
			throw new Exception("Value not found in properties file for key: "+key);
		}	
		return value;
	}

}
