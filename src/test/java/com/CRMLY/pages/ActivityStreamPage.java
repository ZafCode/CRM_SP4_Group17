package com.CRMLY.pages;

import com.CRMLY.stepdefinitions.NavigateMenuStepDefs;
import com.CRMLY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage extends BasePage{
    public ActivityStreamPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "span[class^='feed-add-post-form-link']")
    public List<WebElement> tabs;

    @FindBy(css = "[class='menu-popup-item-text']")
    public List<WebElement> popUpItems;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(css = "#menu-popup-lists")
    public WebElement workflowPopUpMenu;

    //Message
    @FindBy(css = "[class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(css = "[contenteditable=true]")
    public WebElement messageInputBox;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement sentMessageText;

    //file
    @FindBy(css = "[name='bxu_files[]']")
    public WebElement fileUploadInput;

    @FindBy(css = "[class='feed-com-file-name']")
    public WebElement uploadedFileText;

    @FindBy(css = "[class='insert-btn']")
    public WebElement insertButton;

    //event
    @FindBy(css = "#feed-cal-event-namecal_3Jcl")
    public WebElement eventNameInputBox;

    @FindBy(xpath = "(//*[@class='feed-calendar-view-text-cell-r'])[1]")
    public WebElement createdEventText;

    //task
    @FindBy(css = "[data-bx-id='task-edit-title']")
    public WebElement taskInputBox;

    @FindBy(xpath = "//*[@class='feed-task-info-text-title']/a")
    public WebElement createdTaskText;


















}
