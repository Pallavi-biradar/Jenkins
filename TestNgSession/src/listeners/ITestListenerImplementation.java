package listeners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class ITestListenerImplementation implements ITestListener{
	
	public static WebDriver driver;
	@BeforeClass
	public void onStart(ITestContext arg0) {//before class
		Reporter.log("from onStart Method",true);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void onStartSuccess(ITestContext arg0) {//after class
		Reporter.log("from onStartSuccess Method",true);
		driver.close();
	
	}
		
	public void OnTestFailure(ITestResult arg0) {
		Reporter.log("from onTestFailure Method",true);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFile =ts.getScreenshotAs(OutputType.FILE) ;
		File destFile =new File("./errorshots/"+arg0.getMethod().getMethodName()+".png");
		try {
			
	FileUtils.copyFile(tempFile,destFile);
		}catch(IOException e) {
			
		}
	}
	@BeforeMethod
	public void onSucces(ITestContext arg0) {//before Method
		Reporter.log("from onTestSuccess Method",true);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
	@AfterMethod
	public void onTestSuccess(ITestContext arg0) {//after method
		Reporter.log("from onTestSuccess Method",true);
		driver.findElement(By.id("logoutLink")).click();
		
	}
		
}	


