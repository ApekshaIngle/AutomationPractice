package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.vtiger.com/vtigercrm/");
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   WebElement usernameFiled=driver.findElement(By.id("username"));    
   usernameFiled.sendKeys("Admin");
   usernameFiled. clear();
   usernameFiled.sendKeys("Admin");
    WebElement passwordFiled= driver.findElement(By.id("password"));
    passwordFiled  .sendKeys("admin");
    passwordFiled.clear();
    passwordFiled  .sendKeys("admin");
    WebElement loginFiled=driver.findElement(By.className("buttonBlue"));
    loginFiled.click();
    driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
	}

}
