package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_05Test extends BaseClass {
	@Test
	public void instagram() {
		driver.get("https://demo.instagram.com");
		Reporter.log("instagram",true);
	}

}
