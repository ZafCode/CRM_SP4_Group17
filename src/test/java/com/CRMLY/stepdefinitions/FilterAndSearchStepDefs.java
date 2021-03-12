package com.CRMLY.stepdefinitions;

import com.CRMLY.pages.ActivityStreamPage;
import com.CRMLY.pages.FilterAndSearchBoxPage;
import com.CRMLY.utilities.BrowserUtils;
import com.CRMLY.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Filter;

public class FilterAndSearchStepDefs {
    @Given("user is on the filter and search field")
    public void user_is_on_the_filter_and_search_field() {
         new FilterAndSearchBoxPage().searchBox.click();
        BrowserUtils.waitFor(2);
    }

    @When("user choice {string} from Date dropdown")
    public void user_choice_from_Date_dropdown(String string) {
        Select dropdown = new Select(new FilterAndSearchBoxPage().dateDropbox);
        dropdown.selectByVisibleText(string);
    }

    @Then("{string} should be displayed on Date dropdown area")
    public void should_be_displayed_on_Date_dropdown_area(String string) {
        Select dropdown = new Select(new FilterAndSearchBoxPage().dateDropbox);
        String selectedDropDown= dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("verify selected Dropdown",string,selectedDropDown);
        new FilterAndSearchBoxPage().dateDropbox.clear();

    }

    @When("user choice {string} from Type")
    public void user_choice_from_Type(String string) {
        Select dropdown = new Select(new FilterAndSearchBoxPage().typeDropDown);
        dropdown.selectByVisibleText(string);
    }
    @Then("{string} should be displayed on Type area")
    public void should_be_displayed_on_Type_area(String string) {
        Select dropdown = new Select(new FilterAndSearchBoxPage().typeDropDown);
        String selectedDropDown= dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("verify selected Dropdown",string,selectedDropDown);
        new FilterAndSearchBoxPage().typeDropDown.clear();
    }

    @When("user search by Author {string}")
    public void user_search_by_Author(String string) {
        new FilterAndSearchBoxPage().inputAuthor.sendKeys(string, Keys.ENTER);
        new FilterAndSearchBoxPage().filterSearchBtn.click();
    }
    @Then("user should be displayed {string} related content")
    public void user_should_be_displayed_related_content(String string) {

        String expectedText = "XXXHansHans YYYMeyerMeyer";
        String actualTitle= new FilterAndSearchBoxPage().firstContent.getText();

        Assert.assertEquals(expectedText,actualTitle);
        new FilterAndSearchBoxPage().inputAuthor.clear();


    }

    @When("user search by To {string}")
    public void user_search_by_To(String string) {
        new FilterAndSearchBoxPage().toBox.sendKeys(string, Keys.ENTER);
        //new FilterAndSearchBoxPage().toBox.sendKeys("all employees");
        new FilterAndSearchBoxPage().filterSearchBtn.click();
    }
    @Then("user should be displayed to {string} related content")
    public void user_should_be_displayed_to_related_content(String string) {
        Assert.assertEquals(new FilterAndSearchBoxPage().toAllemployees.getText(),"To all employees");

    }



    @When("select {string} on the Add field area")
    public void select_on_the_Add_field_area(String string) {
        new FilterAndSearchBoxPage().addField.click();
        BrowserUtils.waitFor(2);
        new FilterAndSearchBoxPage().tag.click();

    }
    @Then("user should be displayed {string} box on the Filter and Search area")
    public void user_should_be_displayed_box_on_the_Filter_and_Search_area(String string) {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(new FilterAndSearchBoxPage().tag.isDisplayed());

    }

    @When("select MY ACTIVITY on the Filter and Search area")
    public void select_MY_ACTIVITY_on_the_Filter_and_Search_area() {
        new FilterAndSearchBoxPage().myActivity.click();

    }
    @Then("user should be displayed MY ACTIVITY related content")
    public void user_should_be_displayed_MY_ACTIVITY_related_content() {
        String expectedText = "XXXHansHans YYYMeyerMeyer";
        String actualTitle= new FilterAndSearchBoxPage().firstContent.getText();

        Assert.assertEquals(expectedText,actualTitle);
    }



    @Given("user should click on Save Filter button")
    public void user_should_click_on_Save_Filter_button() {
        new FilterAndSearchBoxPage().savefilterBtn.click();
    }
    @When("user puts into filter name box a {string}")
    public void user_puts_into_filter_name_box_a(String string) {
        new FilterAndSearchBoxPage().filterNameBox.sendKeys(string);
    }


    @Then("user should be able to save the new filter")
    public void user_should_be_able_to_save_the_new_filter() {
        new FilterAndSearchBoxPage().saveBtn.click();

    }



}
