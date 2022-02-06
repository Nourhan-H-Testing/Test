package data;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Loadproperties {
	//load the properties file from the folder
	
	public static Properties productdata =
			LoadProperties ("C:\\Users\\Administrator\\eclipse-workspace\\firstframework\\src\\main\\java\\Propertiesproduct\\productdata.properties");

	private static Properties LoadProperties(String path) {
		// TODO Auto-generated method stub

Properties pro=new Properties();
//stream for reading file
try {
	FileInputStream stream=new FileInputStream (path);
	pro.load(stream);
} catch (FileNotFoundException e) {
	System.out.println("Error occurred : "+e.getMessage());
}catch (IOException e ) {
	System.out.println("Error occurred : "+e.getMessage());
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	

	

		// TODO Auto-generated method stub
		return null;
	}

}
