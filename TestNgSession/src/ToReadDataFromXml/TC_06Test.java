package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_06Test extends BaseClass {
	@Test
	public void mytri() {
		driver.get("https://www.mytri.com");
		Reporter.log("mytri",true);
	}

}
