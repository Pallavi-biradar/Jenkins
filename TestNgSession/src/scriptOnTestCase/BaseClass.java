package scriptOnTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	 public WebDriver driver;
	 @BeforeClass
	 public void CreateProductOrder() {
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	 }
	 @AfterMethod
	 public void Logout() {
		 driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		 driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	 }
	 
	 
	 @AfterClass
	 public void closeApp() {
		 driver.quit();
		 System.out.println("logout ");
		 
	 }
	

}
