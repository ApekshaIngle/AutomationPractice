package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SeleniumUtil;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=SeleniumUtil
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
