package pageObjectModel;

import org.testng.annotations.Test;

public class TC_01 extends BaseClass {
	@Test
	 public void order() {
		driver.get("https://localhost:8888");
		driver.navigate().refresh();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getUsernameTextfield().sendKeys("admin");
		loginPage.getPasswordTextfield().sendKeys("root");
		loginPage.getLoginbutton().click();
		
		
		
	}
	
	

}
