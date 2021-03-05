package com.CRMLY.stepdefinitions;

import com.CRMLY.pages.ActivityStreamPage;
import com.CRMLY.pages.TasksPage;
import com.CRMLY.utilities.BrowserUtils;
import com.CRMLY.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class TasksStepDefs {

    @When("the user navigates to {string} tab {string} module")
    public void the_user_navigates_to_tab_module(String string, String string2) {
        new ActivityStreamPage().navigateToModule(string,string2);
    }

    @Then("page title contains {string} or search filter contains {string}")
    public void page_title_contains_or_search_filter_contains(String string, String string2) {


        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains(string));

        List<String> actualFilterText = BrowserUtils.getElementsText(new TasksPage().Filters);
        Assert.assertTrue(actualFilterText.contains(string2));

    }

    @When("the user clicks on New Task button")
    public void the_user_clicks_on_New_Task_button() {

        new TasksPage().NewTaskButton.click();

    }

    @Then("the url contains edit")
    public void the_url_contains_edit() throws InterruptedException {
        Thread.sleep(3000);
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("edit"));



    }
}
