package com.CRMLY.pages;

import com.CRMLY.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class TasksPage extends BasePage{
    public TasksPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "(//div[.='In progress'])[1]")
    public WebElement InProgressFilter;

    @FindBy(xpath = "(//div[.='Role: Ongoing'])[1]")
    public WebElement OngoingFilter;

    @FindBy(xpath = "(//div[.='Role: Assisting'])[1]")
    public WebElement AssistingFilter;

    @FindBy(xpath = "(//div[.='Role: Following'])[1]")
    public WebElement FollowingFilter;

    @FindBy(xpath = "//div[@class='main-ui-square-item']")
    public List<WebElement> Filters;

    @FindBy(id = "tasks-buttonAdd")
    public WebElement NewTaskButton;



}
