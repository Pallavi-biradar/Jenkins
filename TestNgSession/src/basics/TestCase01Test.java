package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase01Test {
	@DataProvider
	public String[][] sendData(){
		String[][] sarr= {
			            	{"admin","manager"},
			            	{"trainee","trainee"}
		                 };
		return sarr;
	}
	
	@Test(dataProvider="sendData") 
	public void demo(String username,String password) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		File absPath=new File("./resources/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(absPath);
		
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		
		driver.get("https://actitime.com");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password,Keys.ENTER);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		
		
		
		
		
	}
	
		
				
		
		
	}
	
	


