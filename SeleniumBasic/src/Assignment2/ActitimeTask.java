package Assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SeleniumUtil;

public class ActitimeTask {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.actitime.com/login.do");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.cssSelector(".tasks")).click();
	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.cssSelector(".createNewTasks")).click();
	
	Thread.sleep(1000);

	
driver.findElement(By.cssSelector(".customerSelector >div>.comboboxButton>.selectedItem")).click();
Thread.sleep(2000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".customerSelector .searchItemList")));
List<WebElement>customerList= (List<WebElement>) driver.findElement(By.cssSelector(".customerSelector .searchItemList>div"));

if(customerList.size()>2) {
	customerList.get(customerList.size()-1).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".projectSelector>div>.comboboxButton>.selectedItem")).click();
	Thread.sleep(1000);

	List<WebElement>projectList= (List<WebElement>) driver.findElement(By.cssSelector(".projectSelector .searchItemList>div"));
	if(customerList.size()>3) {
		customerList.get(3).click();
	}else {
		customerList.get(0).click();
		driver.findElement(By.cssSelector(".selectProjectRow.newProject")).sendKeys("iPhone 15");

	}
}else {
	customerList.get(0).click();
	
List<WebElement> newinputfiled=(List<WebElement>) driver.findElement(By.cssSelector(".newCustomerProjectField"));
newinputfiled.get(0).sendKeys("Apple");
newinputfiled.get(1).sendKeys("i-phone");
}
	}

}
