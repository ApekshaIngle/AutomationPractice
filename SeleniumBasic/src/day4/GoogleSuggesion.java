package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggesion {
     public static WebDriver setUp(String browserName,String url ) {
    	 WebDriver driver=null;
    	 if (browserName.equalsIgnoreCase("chrome")) {
    		 driver=new ChromeDriver();
    	 }else if (browserName.equalsIgnoreCase("Firefox")) {
    	 driver=new FirefoxDriver();
    	 }
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	 return driver;
     }
	public static void main(String[] args) {
	WebDriver driver =setUp("chrome" ,"https://www.google.com/");
     driver.findElement(By.name("q")).sendKeys("Selenium");
	}

}
