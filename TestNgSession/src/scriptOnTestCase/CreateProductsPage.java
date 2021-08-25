package scriptOnTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductsPage {
	public CreateProductsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="user_name") private WebElement usernameTextField;
	
	@FindBy(name="user_password") private WebElement passwordTextField;
	
	@FindBy(id="submitButton") private WebElement loginbutton;
	
	@FindBy(linkText="Products") private WebElement productlinkText;
	
	@FindBy(xpath="//img[@alt='Create Product...']") private WebElement plusImage;
	
    @FindBy(name="productname") private WebElement productnameTextField;
	
	@FindBy(xpath="//input[@accesskey='S']") private WebElement savebutton;
	
	
	public WebElement getSavebutton() {
		return savebutton;
	}


	public WebElement getProductnameTextField() {
		return productnameTextField;
	}


	public WebElement getPlusImage() {
		return plusImage;
	}


	public WebElement getProductlinkText() {
		return productlinkText;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	
	
}
	
