package com.CRMLY.stepdefinitions;

import com.CRMLY.pages.LoginPage;
import com.CRMLY.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage login = new LoginPage();



    @When("user log in with HR credentials")
    public void user_log_in_with_HR_credentials() {
        login.loginHR();
    }

    @Then("verify that page title is {string}")
    public void verify_that_page_title_is(String str) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains("Portal"));
    }


}
