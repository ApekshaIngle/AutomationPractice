package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/");
   WebElement inputfiled= driver.findElement(By.name("username"));
   inputfiled.sendKeys("Admin");
   WebElement  passwordFiled=driver.findElement(By.name("password"));
   passwordFiled.sendKeys("admin123");
   WebElement loginpage =driver.findElement(By.tagName("button"));
   loginpage.click();
   String ExpectedTitlePage="OrangeHRM";
   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
   String ActualTitlePage=driver.getTitle();
   System.out.println("ExpectedTitlePage :"+ExpectedTitlePage);
   System.out.println("ActualTitlePage :"+ActualTitlePage);
   System.out.println("Is orangeHRM login :"+ActualTitlePage.equals(ExpectedTitlePage));
    driver.findElement(By.className("oxd-userdropdown-icon"));
    driver.findElement(By.linkText("Logout"));

     
	}

}
