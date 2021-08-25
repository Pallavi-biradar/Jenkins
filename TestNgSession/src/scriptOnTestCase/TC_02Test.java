package scriptOnTestCase;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TC_02Test  extends BaseClass{
	@Test
	public void CreateProductWithoutMandatoryField() {
		driver.get("http://localhost:8888/");
		driver.navigate().refresh();
		System.out.println("Login page should be display");
		
		CreateProductsPage1 createProductsPage1= new CreateProductsPage1(driver);
		
		createProductsPage1.getUsernameTextField().sendKeys("admin");
		createProductsPage1.getPasswordTextField().sendKeys("root");
		createProductsPage1.getLoginbutton().click();
		System.out.println("Home page should be display");
		
		createProductsPage1.getProductlinkText().click();
		System.out.println("Products list page should be display");
		
		createProductsPage1.getPlusImage().click();
		System.out.println("Creating New Product should be display");
		
		createProductsPage1.getSavebutton().click();
		System.out.println("Product should be available in product list");
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		}
		



}
