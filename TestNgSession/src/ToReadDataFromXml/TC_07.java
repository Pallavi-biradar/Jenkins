package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_07 extends BaseClass {
	@Test
	public void mintra() {
		driver.get("https://www.mintra.com");
		Reporter.log("mintra",true);
	}

}
