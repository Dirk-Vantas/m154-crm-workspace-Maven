package ch.ilv.crm.web.selenium;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Selenium {

	
	
	@Test
	  public void createproduct() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gid\\Desktop\\dev-tools\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        WebDriver driver=new ChromeDriver(options);

	    driver.get("http://localhost:7070/");
	    driver.manage().window().setSize(new Dimension(848, 990));
	    driver.findElement(By.linkText("Manage Products")).click();
	    driver.findElement(By.name("description")).click();
	    driver.findElement(By.name("description")).sendKeys("test product");
	    driver.findElement(By.cssSelector("form:nth-child(3) > p > input")).click();
	    driver.close();
	  }
	@Test
	  public void displayproduct() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gid\\Desktop\\dev-tools\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        WebDriver driver=new ChromeDriver(options);

	        
	    driver.get("http://localhost:7070/");
	    driver.manage().window().setSize(new Dimension(848, 990));
	    driver.findElement(By.linkText("Manage Products")).click();
	    driver.findElement(By.name("id")).click();
	    driver.findElement(By.name("id")).sendKeys("1");
	    driver.findElement(By.cssSelector("form:nth-child(9) > p > input")).click();
	    driver.close();
	  }


}