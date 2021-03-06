package com.CRMLY.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TrainingFuncPage extends BasePage{

    @FindBy(xpath = "//div[@class='search-form']//input[@name='q']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//input[@name='s']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='search-page']/a[1]/b")
    public WebElement searchResults;

    @FindBy(className = "main-buttons-item-text-title")
    public List<WebElement> submenuItems;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']/table/tbody")
    public WebElement myCourseTable;

    @FindBy(name = "NAME")
    public WebElement firstnameInputBox;

    @FindBy(name = "LAST_NAME")
    public WebElement lastnameInputBox;

    @FindBy(name = "save")
    public WebElement saveButton;



    public void navigateToSubmenu(String submenuText){
        List<WebElement> submenu = submenuItems;
        for (WebElement element : submenu) {
            if(element.getText().equals(submenuText)){
                element.click();
                break;
            }
        }
    }

}
