package scriptOnTestCase;

import org.testng.annotations.Test;

public class TC_05Test extends BaseClass {
	@Test
	public void CreateProductWithMandatoryFields() {
		driver.get("http://localhost:8888/");
		driver.navigate().refresh();
		System.out.println("Login page should be display");
		
		CreateProductsPage4 selectProduct= new CreateProductsPage4(driver);
		
		selectProduct.getUsernameTextField().sendKeys("admin");
		selectProduct.getPasswordTextField().sendKeys("root");
		selectProduct.getLoginbutton().click();
		System.out.println("Home page should be display");

		selectProduct.getProductlinkText().click();
		System.out.println("Products list page should be display");

		selectProduct.getPlusImage().click();
		System.out.println("Creating New Product should be display");
		
		selectProduct.getProductnameTextField().sendKeys("dress");
		System.out.println("Product Should be created with product name ");
		
		selectProduct.getSavebutton().click();
		System.out.println("Product should be available in product list");
		
		selectProduct.getProductlist().click();
		System.out.println("Products list page should be display");
		
		selectProduct.getSelectProduct().click();
		System.out.println("Product should be selected");
		
		
		
		
		
		
	}
		

}
