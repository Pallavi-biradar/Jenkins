package scriptOnTestCase;

import org.testng.annotations.Test;

public class TC_01Test extends BaseClass{
	@Test
	public void CreateProduct() {
		driver.get("http://localhost:8888/");
		driver.navigate().refresh();
	
		
		CreateProductsPage createProductsPage= new CreateProductsPage(driver);
		
		createProductsPage.getUsernameTextField().sendKeys("admin");
		createProductsPage.getPasswordTextField().sendKeys("root");
		createProductsPage.getLoginbutton().click();
	
		
		createProductsPage.getProductlinkText().click();
		
		
		createProductsPage.getPlusImage().click();
		
		
		createProductsPage.getProductnameTextField().sendKeys("mobile");
		
		
        createProductsPage.getSavebutton().click();
		
		
		
	}
		
	
	
	

}
