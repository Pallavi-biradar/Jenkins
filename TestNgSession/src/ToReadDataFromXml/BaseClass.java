package ToReadDataFromXml;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseClass {
	public WebDriver driver;
	
	@Parameters("bname")
	@BeforeMethod
	
	public void readData(String bname) {
		if(bname.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
			
		}
		
		@AfterMethod
		public void closingBrowser() {
			driver.close();
		}
		
			
		
	
	
	
	
	

}
