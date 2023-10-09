package day0.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver= new ChromeDriver();
      driver.get("https://demo.actitime.com/");
     System.out.println("Title :"+driver.getTitle());
     System.out.println("currentUrl :"+driver.getCurrentUrl());
     String sourceCode=driver.getPageSource();
     System.out.println("SourceCode :"+sourceCode);
     System.out.println("sourceCode length :"+sourceCode.length());
     driver.close();
	}

}
