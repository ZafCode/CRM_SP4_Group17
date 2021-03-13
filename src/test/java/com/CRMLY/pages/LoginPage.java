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


    public void loginHR (){
        user.sendKeys(ConfigurationReader.get("hr_username"));
        pass.sendKeys(ConfigurationReader.get("hr_password"));
        submit.click();

    }



}
