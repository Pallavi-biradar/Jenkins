package testCaseScripts;

import org.testng.annotations.Test;


import pomRepository.AdminPage;
import pomRepository.BaseTest;
import pomRepository.HomePage;
import pomRepository.SelectClassUtil;



public class TC_04Test extends BaseTest{



	@Test

	

	public void searchUser() {

		HomePage homePage=new HomePage(driver);

		homePage.getAdmin().click();

		AdminPage adminPage=new AdminPage(driver);

		adminPage.getSearchUserName().clear();

		adminPage.getSearchUserName().sendKeys("Sudarshan");

		SelectClassUtil dropDown=new SelectClassUtil();

		dropDown.selectDropDown(adminPage.getUserRole(), "ESS");

		adminPage.getSearchemployeeName().sendKeys("David Morris");

		dropDown.selectDropDown(adminPage.getSearchstatus(), "Enabled");

		adminPage.getSearch().click();

	}
}