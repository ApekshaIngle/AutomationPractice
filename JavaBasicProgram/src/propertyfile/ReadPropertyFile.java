package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//C:\Automation\Workspace\JavaBasicProgram\Slenium\Test.properties
     String filepath=System.getProperty("user.dir")+"\\Slenium\\Test.properties";
     System.out.println("current dir :"+filepath);
     
     FileInputStream fis=new FileInputStream (filepath);
     
     Properties prop=new Properties();
     
     prop.load(fis);
     System.out.println("First name :"+prop.getProperty("Firstname"));
     System.out.println("First name :"+prop.getProperty("Lastname"));
     System.out.println("First name :"+prop.getProperty("emailid"));
     System.out.println("First name :"+prop.getProperty("mobilenumber"));

	}

}
