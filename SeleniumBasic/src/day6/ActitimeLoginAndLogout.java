package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SeleniumUtil;

public class ActitimeLoginAndLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
       String expectedhomepagetitle="actiTIME-Enter Time-Track";
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
       
       wait. until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
       String actualhomepagetitle=driver.getTitle();
       System.out.println("Homepage actual title :"+actualhomepagetitle);
       System.out.println("Homepage expectedhomepagetitle :"+expectedhomepagetitle);
       System.out.println("Is login succesfully ?"+actualhomepagetitle.equals(expectedhomepagetitle));
     driver.findElement(By.id("logoutLink")).click();
     String expectedloginpageTitle="actiTIME-Login";
     wait.until(ExpectedConditions.titleIs(expectedloginpageTitle));
     String actualLoginpageTitle=driver.getTitle();
     System.out.println("Is logout done succesfully ?"+actualLoginpageTitle.equals(expectedloginpageTitle));
     driver.close();
	}

}
