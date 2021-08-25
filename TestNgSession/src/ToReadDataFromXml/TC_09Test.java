package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_09Test extends BaseClass {
	@Test
	public void mytri() {
		driver.get("https://www.flipkart.com");
		Reporter.log("flipkart",true);
	}

}
