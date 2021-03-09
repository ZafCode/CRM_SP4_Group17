package com.CRMLY.stepdefinitions;

import com.CRMLY.pages.LoginPage;
import com.CRMLY.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage login = new LoginPage();



    @Given("user log in with HR credentials")
    public void user_log_in_with_HR_credentials() {
        login.loginHR();
    }

    @Then("verify that page title is {string}")
    public void verify_that_page_title_is(String str) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains("Portal"));
    }
    @Given("user log in with invalid credentials")
    public void user_log_in_with_invalid_credentials() {
        login.invalid1();
    }

    @Then("verify that error text appeared")
    public void verify_that_error_text_appeared() {
        Assert.assertTrue(login.err.getText().contains("Incorrect"));
    }

    @Given("user log in with invalid {string} and {string} credentials")
    public void user_log_in_with_invalid_and_credentials(String str_user, String str_pass) {
        login.invalid2(str_user,str_pass);
    }
}
