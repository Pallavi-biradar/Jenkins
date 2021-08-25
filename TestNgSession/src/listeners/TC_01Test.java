package listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.ITestListenerImplementation.class)
public class TC_01Test  {
	

	@Test
	public void CreateAccount() {
		ITestListenerImplementation.driver.findElement(By.linkText("Reporter")).click();
		int i=100/0;
	}

}
