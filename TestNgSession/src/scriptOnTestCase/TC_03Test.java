package scriptOnTestCase;

import org.testng.annotations.Test;

public class TC_03Test extends BaseClass{
	@Test
	public void CreateProductWithActive() {
		driver.get("http://localhost:8888/");
		driver.navigate().refresh();
		System.out.println("Login page should be display");
		
		CreateProductsPage2 productWithActive= new  CreateProductsPage2(driver);
		
		productWithActive.getUsernameTextField().sendKeys("admin");
		productWithActive.getPasswordTextField().sendKeys("root");
		productWithActive.getLoginbutton().click();
		System.out.println("Home page should be display");
		
		productWithActive.getProductlinkText().click();
		System.out.println("Products list page should be display");
		
        productWithActive.getPlusImage().click();
        System.out.println("Creating New Product should be display");
		
		productWithActive.getProductnameTextField().sendKeys("Laptop");
		System.out.println("Product Should be created with product name with Active");
		
        productWithActive.getSavebutton().click();
        System.out.println("Product should be available in product list");
		
		
		
		
		
	}

}
