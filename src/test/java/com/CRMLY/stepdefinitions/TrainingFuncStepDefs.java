package com.CRMLY.stepdefinitions;

import com.CRMLY.pages.TrainingFuncPage;
import com.CRMLY.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TrainingFuncStepDefs {

    TrainingFuncPage trainingFuncPage = new TrainingFuncPage();

    @When("user navigates to {string} tab and {string} menu")
    public void user_navigates_to_tab_and_menu(String tab, String menu) {
        trainingFuncPage.navigateToModule("Services", "Training");
    }

    @Then("user should be on the {string} page as a default")
    public void user_should_be_on_the_page_as_a_default(String expectedPageTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue("verify page title", actualTitle.contains(expectedPageTitle));
    }

    @Then("user searches the courses including {string} keywords")
    public void user_searches_the_courses_including_keywords(String keyword) {
        trainingFuncPage.searchInputBox.sendKeys(keyword);
        trainingFuncPage.searchButton.click();
    }

    @And("as a result user should have to see the specific course_courses including {string} keywords")
    public void as_a_result_user_should_have_to_see_the_specific_course_courses_including_keywords(String expectedKeyword) {
        String result = trainingFuncPage.searchResults.getText();
        Assert.assertTrue("Verify results", result.contains(expectedKeyword));

    }


    @Then("user navigates to {string} submenu")
    public void user_navigates_to_submenu(String submenuText) {
        trainingFuncPage.navigateToSubmenu(submenuText);
    }

    @Then("page title should contains {string}")
    public void page_title_should_contains(String expectedPageTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue("Verify page title", actualTitle.contains(expectedPageTitle));
    }

    @Then("user should see her_his {string} in the table")
    public void user_should_see_her_his_in_the_table(String courseName) {
        WebElement courseTable = trainingFuncPage.myCourseTable;
        Assert.assertTrue("Verify course name in the table",courseTable.getText().contains(courseName));
    }

    @Then("user should able to edit her_his profile")
    public void user_should_able_to_edit_her_his_profile() {
        String firstname = "Hans";
        String lastname  = "Meyer";
        trainingFuncPage.firstnameInputBox.sendKeys(firstname);
        trainingFuncPage.lastnameInputBox.sendKeys(lastname);
        trainingFuncPage.saveButton.click();
    }
}
