package scriptOnTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductsPage3 {
public CreateProductsPage3(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
   }
		
	@FindBy(name="user_name")private WebElement usernameTextField;
	
	@FindBy(name="user_password")private WebElement passwordTextField;
	
	@FindBy(id="submitButton")private WebElement loginbutton;
	
	@FindBy(linkText="Products")private WebElement productlinkText;
	
	@FindBy(xpath="//img[@alt='Create Product...']")private WebElement plusImage;
	
	@FindBy(name="productname")private WebElement productnameTextField;
	
	@FindBy(name="discontinued")private WebElement productnameWithActive;

	@FindBy(xpath="//input[@accesskey='S']")private WebElement savebutton;
	
	public WebElement getProductnameWithActive() {
		return productnameWithActive;
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
