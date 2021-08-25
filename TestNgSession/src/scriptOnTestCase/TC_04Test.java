package scriptOnTestCase;

import org.testng.annotations.Test;

public class TC_04Test extends BaseClass{
	@Test
	public void CreateProductWithOutActive() {
		driver.get("http://localhost:8888/");
		driver.navigate().refresh();
		System.out.println("Login page should be display");
		
		CreateProductsPage3 productWithoutActive= new CreateProductsPage3(driver);
		
		productWithoutActive.getUsernameTextField().sendKeys("admin");
		productWithoutActive.getPasswordTextField().sendKeys("root");
		productWithoutActive.getLoginbutton().click();
		System.out.println("Home page should be display");
		
		productWithoutActive.getProductlinkText().click();
		System.out.println("Products list page should be display");
		
		productWithoutActive.getPlusImage().click();
		System.out.println("Creating New Product should be display");
		
		productWithoutActive.getProductnameTextField().sendKeys("dress");
		System.out.println("Product Should be created with product name ");
		
		productWithoutActive.getProductnameWithActive().click();
		System.out.println("Created Product should be inactive");
		
		productWithoutActive.getSavebutton().click();
		System.out.println("Product should be available in product list");
		
		
		
		
		
	}


}
