package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepsToReadPropertyFiles {

	public static void main(String[] args) throws IOException {
		//C:\Automation\Workspace\JavaBasicProgram\Slenium\Details.properties
        String filepath=System.getProperty("user.dir")+"\\Slenium\\Details.properties";
          FileInputStream f1=new FileInputStream(filepath);
          
          Properties p1=new Properties();
          
          p1.load(f1);
          
          System.out.println("Application URL :"+p1.getProperty("ApplicationUrl"));
          System.out.println("Application URL :"+p1.getProperty("Username"));
          System.out.println("Application URL :"+p1.getProperty("password"));
          System.out.println("Application URL :"+p1.getProperty("expectedtitle"));
          

	}

}
