package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_02Test extends BaseClass {
	@Test
	public void kite() {
		driver.get("https://www.kite.com");
		Reporter.log("kite",true);
	}

}
