package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataProperty {

	public static void main(String[] args) throws IOException {
// C:\Automation\Workspace\JavaBasicProgram\Slenium\TestData1.properties
      String Filepath=System.getProperty("user.dir")+"\\Slenium\\TestData1.properties";
      
      FileInputStream f=new FileInputStream(Filepath);
      
      Properties p=new Properties();
      p.load(f);
      System.out.println("username :"+p.getProperty("username"));
      System.out.println("password :"+p.getProperty("password"));
      System.out.println("email :"+p.getProperty("email"));
      System.out.println("maboilenumber :"+p.getProperty("contactNumber"));
      
      String roi =p.getProperty("roi");
      System.out.println("Roi :"+roi);
		double interest=Double.parseDouble(roi);
		double finalvalue=interest*100;
		
      p.setProperty("username", "Apeksha");
      FileOutputStream f1=new FileOutputStream(".\\Slenium\\TestData1.properties");
      p.store(f1, "updated username");
      f1.flush();
      f1.close();
	}

}
