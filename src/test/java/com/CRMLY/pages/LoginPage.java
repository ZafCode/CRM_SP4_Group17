package com.CRMLY.pages;

import com.CRMLY.utilities.BrowserUtils;
import com.CRMLY.utilities.ConfigurationReader;
import com.CRMLY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{



    @FindBy(name = "USER_LOGIN")
    public WebElement user;

    @FindBy(name = "USER_PASSWORD")
    public WebElement pass;

    @FindBy(className = "login-btn")
    public WebElement submit;

    @FindBy(className = "errortext")
    public WebElement err;



    public void loginHR (){
        BrowserUtils.waitFor(2);
        user.sendKeys(ConfigurationReader.get("hr_username"));
        pass.sendKeys(ConfigurationReader.get("hr_password"));
        submit.click();

    }

    public void invalid1 (){
        BrowserUtils.waitFor(2);
        user.sendKeys(ConfigurationReader.get("invalid_user"));
        pass.sendKeys(ConfigurationReader.get("invalid_password"));
        submit.click();

    }

    public void invalid2 (String str1, String str2){
        BrowserUtils.waitFor(2);
        user.sendKeys(str1);
        pass.sendKeys(str2);
        submit.click();

    }



}
