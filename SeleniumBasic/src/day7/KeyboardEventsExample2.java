package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyboardEventsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.automationtesting.in/Register.html");
       driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"))
       .sendKeys("pune",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
       driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
       driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(Keys.TAB);

	}

}
