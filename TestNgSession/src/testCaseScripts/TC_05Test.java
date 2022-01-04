package testCaseScripts;

import org.testng.annotations.Test;

import pomRepository.BaseTest;
import pomRepository.HomePage;

import pomRepository.RecruitmentCandidatePage;
import pomRepository.SelectClassUtil;



public class TC_05Test extends BaseTest{

    @Test

	public void addCandidateDetails() {

		HomePage homePage=new HomePage(driver);

		homePage.getRecruitment().click();

		RecruitmentCandidatePage recruitementPage=new RecruitmentCandidatePage(driver);

		recruitementPage.getAddButton().click();

		recruitementPage.getFirstNameTextField().sendKeys("Pallavi");

		recruitementPage.getMiddleNameTextField().sendKeys("N");

		recruitementPage.getLastNameTextField().sendKeys("Biradar");

		recruitementPage.getEmailTextField().sendKeys("biradarpallavi66@gmail.com");

		recruitementPage.getContactNoTextField().sendKeys("8546951642");

		recruitementPage.getJobVacancyDropdown().click();

		SelectClassUtil dropdown=new SelectClassUtil();

		dropdown.selectDropDown(recruitementPage.getJobVacancyDropdown(), "Associate IT Manager");

		recruitementPage.getResume().sendKeys("C:\\Users\\PALLAVI\\Desktop\\desktop");

		recruitementPage.getKeywordsTextField().sendKeys("abc");

		recruitementPage.getCommentsTextField().sendKeys("details of Candidate");

		recruitementPage.getCheckbox().click();

		recruitementPage.getSaveButton().click();

	}

}