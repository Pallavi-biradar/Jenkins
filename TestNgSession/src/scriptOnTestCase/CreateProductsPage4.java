package scriptOnTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductsPage4 {
public CreateProductsPage4(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
}

	@FindBy(name="user_name")private WebElement usernameTextField;
	
	@FindBy(name="user_password")private WebElement passwordTextField;
	
	@FindBy(id="submitButton")private WebElement loginbutton;
	
	@FindBy(linkText="Products")private WebElement productlinkText;
	
	@FindBy(xpath="//img[@alt='Create Product...']")private WebElement plusImage;
	
	@FindBy(name="productname")private WebElement productnameTextField;
	
	@FindBy(xpath="//input[@accesskey='S']")private WebElement savebutton;
	
	@FindBy(linkText="Products")private WebElement productlist;
	
	@FindBy(id="58")private WebElement selectProduct;
	
	public WebElement getSelectProduct() {
		return selectProduct;
	}


	public WebElement getProductlist() {
		return productlist;
	}


	public WebElement getUsernameTextField() {
		return usernameTextField;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public WebElement getProductlinkText() {
		return productlinkText;
	}


	public WebElement getPlusImage() {
		return plusImage;
	}


	public WebElement getProductnameTextField() {
		return productnameTextField;
	}


	public WebElement getSavebutton() {
		return savebutton;
	}


	

}
