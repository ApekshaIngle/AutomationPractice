package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://demo.actitime.com/");
     WebElement usernameinputfiled=driver.findElement(By.id("username"));
     usernameinputfiled.sendKeys("admin123");
     usernameinputfiled.clear();
     usernameinputfiled.sendKeys("admin");
     WebElement PasswordFild=driver.findElement(By.name("pwd"));
     PasswordFild.sendKeys("manager");
     WebElement loginpage=driver.findElement(By.id("loginButton"));
     loginpage.click();
     String expectedhomeTitle="actiTIME -  Enter Time-Track";
     
     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
     wait.until(ExpectedConditions.titleIs(expectedhomeTitle));
    
     String actualhomepageTitle=driver.getTitle();
     System.out.println("Actual Home page Title :"+actualhomepageTitle);
     System.out.println("Expected Home page  Title :"+expectedhomeTitle);
     System.out.println("Is login succesfully :"+actualhomepageTitle.equals(expectedhomeTitle));

     WebElement loggout=driver.findElement(By.id("logoutLink"));
     loggout.click();
     
	}

}
