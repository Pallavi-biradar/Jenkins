package ToReadDataFromXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_04Test  extends BaseClass{
	@Test
	public void youtube() {
		driver.get("https://demo.youtube.com");
		Reporter.log("youtube",true);
	}

}
