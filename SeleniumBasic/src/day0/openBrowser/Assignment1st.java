package day0.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get( " https://flipkart.com/");
      System.out.println("Title :"+driver.getTitle());
      String actualTitle=driver.getTitle();
      String expectedTitle="flipkart";
      System.out.println("is flipkart is open :"+actualTitle.equals(expectedTitle));
      System.out.println("current Url :"+driver.getCurrentUrl());
      String sourceCode=driver.getPageSource();
      System.out.println("source code :"+sourceCode);
      System.out.println("source code length :"+sourceCode.length());
     
	}

}
