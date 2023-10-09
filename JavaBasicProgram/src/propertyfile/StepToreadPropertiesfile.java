package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepToreadPropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//C:\Automation\Workspace\JavaBasicProgram\Slenium\TestData.properties
    String filepath=System.getProperty("user.dir")+"\\Slenium\\TestData.properties";
    
    FileInputStream f2=new FileInputStream(filepath);
    
    Properties p2=new Properties();
    p2.load(f2);
    System.out.println("student name :"+p2.getProperty("studentname"));
    System.out.println("English :"+p2.getProperty("English"));
    System.out.println("history :"+p2.getProperty("history"));
    System.out.println("math :"+p2.getProperty("math"));
    System.out.println("marathi :"+p2.getProperty("marathi"));
    System.out.println("Totalmarks :"+p2.getProperty("Totalmarks"));

	}

}
