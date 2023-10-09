package day0.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver =new ChromeDriver();
     driver.get("https://demo.vtiger.com/vtigercrm/index.php");
     System.out.println("Title :"+driver.getTitle());
     String actualTitle=driver.getTitle();
     String expectedTitle="vtiger";
     System.out.println("result :"+actualTitle.equals(expectedTitle));
     System.out.println("current url :"+driver.getCurrentUrl());
     String sourceCode=driver.getPageSource();
     System.out.println("source code :"+sourceCode);
     System.out.println("source code length :"+sourceCode.length());
	}

}
