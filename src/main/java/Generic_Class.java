import java.io.FileInputStream;
import java.util.Properties;

public class Generic_Class 
{

	
	//read data from Property file

	public static String getPropertyValue(String propKey) 
	{

		Properties config = null;
		try {
			config = new Properties();
			FileInputStream ip = new FileInputStream("./Resources/config.properties");

			config.load(ip);
		} catch (Exception e) {


		}

		return config.getProperty(propKey);

	}
}
