package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_08Test extends BaseClass {
	@Test
	public void amazon() {
		driver.get("https://www.amazon.com");
		Reporter.log("amazon",true);
	}

}
