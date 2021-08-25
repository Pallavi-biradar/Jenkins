package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		
	}
	@FindBy(name="user_name")
	private WebElement usernameTextField;

	@FindBy(name="user_password")
	private WebElement passwordTextField;

	@FindBy(id="submitButton")
	private WebElement loginbutton;

	public WebElement getUsernameTextfield() {
		return  usernameTextField;
	}

	public WebElement getPasswordTextfield() {
		return  passwordTextField;

	}

	public WebElement getLoginbutton() {
		return  loginbutton;

	}
	

	
}
