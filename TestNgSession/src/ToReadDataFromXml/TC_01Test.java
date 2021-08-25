package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01Test extends BaseClass {
	@Test
	public void actitime() {
		driver.get("https://demo.actitime.com");
		Reporter.log("actitime",true);
	}
	

}
