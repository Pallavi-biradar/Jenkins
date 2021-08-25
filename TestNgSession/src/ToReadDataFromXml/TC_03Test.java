package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_03Test extends BaseClass {
	@Test
	public void actitime() {
		driver.get("https://demo.facebook.com");
		Reporter.log("facebook",true);
	}

}
