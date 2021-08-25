package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_10Test extends BaseClass {
	@Test
	public void github() {
		driver.get("https://www.github.com");
		Reporter.log("github",true);
	}

}
