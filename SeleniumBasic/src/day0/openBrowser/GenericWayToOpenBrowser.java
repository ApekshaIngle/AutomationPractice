package day0.openBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		 String actualTitle=driver.getTitle();
	
		 String expectedTitle="Google";
	System.out.println("result :"+actualTitle.equals(expectedTitle));
		driver.getCurrentUrl();
		String sourceCode=driver.getPageSource();
		driver.close();
	}

}
/*1.Open Chrome browser
  2.enter googlle url
  3.validate google search page opened or not*/