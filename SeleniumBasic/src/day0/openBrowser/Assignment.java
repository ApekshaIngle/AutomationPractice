package day0.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver =new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/\r\n");
     System.out.println("Title :"+driver.getTitle());
      String actualTitle=driver.getTitle();
      String expectedTitle="orangehrmlive";
      System.out.println("is orangHRM page open? :"+actualTitle.equals(expectedTitle));
      System.out.println("current url :"+driver.getCurrentUrl());
      String actualUrl=driver.getCurrentUrl();
      String expectedUrl=driver.getCurrentUrl();
      String sourceCode=driver.getPageSource();
      System.out.println("source code length :"+sourceCode.length());
      driver.close();

	}

}
