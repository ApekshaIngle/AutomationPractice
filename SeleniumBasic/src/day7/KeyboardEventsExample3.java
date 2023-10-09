package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyboardEventsExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.automationtesting.in/Register.html");
    
  driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("pune",Keys.F5);
	}

}   
