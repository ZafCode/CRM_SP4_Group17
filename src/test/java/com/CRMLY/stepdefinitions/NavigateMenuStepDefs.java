package com.CRMLY.stepdefinitions;

import com.CRMLY.pages.ActivityStreamPage;
import com.CRMLY.utilities.BrowserUtils;
import com.CRMLY.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class NavigateMenuStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    private final String message = "Hello";
    private final String fileName = "fff.txt";
    private final String eventName = "Birthday Party!";
    private final String pollText = "Birthday Party Day ???";
    private final String taskText = "Order a pizza";
    private final String appreciationText = "The company shows great appreciation for its employees' contributions.";
    private final String announcementText = "The king published an official announcement yesterday.";
    private final String workflowOpenClassAtt = "popup-window popup-window-no-paddings popup-window-show-animation-opacity";

    @Then("the user clicks on the {string} tab")
    public void the_user_clicks_on_the_tab(String tab) {
        activityStreamPage.manageDropdown(activityStreamPage.tabs,tab);
    }

    @Then("the user clicks the send button")
    public void the_user_clicks_the_send_button() {
        try {
            Alert alert = Driver.get().switchTo().alert();
            alert.accept();
        }
        catch (NoAlertPresentException e) {
        }
        activityStreamPage.sendButton.click();
    }

    @Then("the sent message should appear in the Activity Stream page")
    public void the_sent_message_should_appear_in_the_Activity_Stream_page() {
        BrowserUtils.waitForPageToLoad(4);
        Assert.assertEquals(message,activityStreamPage.sentMessageText.getText());
    }

    @Then("the user clicks {string} pop-up item")
    public void the_user_clicks_pop_up_item(String popUpName) {
        activityStreamPage.manageDropdown(activityStreamPage.popUpItems,popUpName);
    }

    @Then("the user enters valid data about the file")
    public void the_user_enters_valid_data_about_the_file() {
        BrowserUtils.waitFor(2);
        activityStreamPage.fileUploadInput.sendKeys("C:\\Users\\ZdN\\Desktop\\"+fileName);
    }

    @Then("the sent file should appear in the Activity Stream page")
    public void the_sent_file_should_appear_in_the_Activity_Stream_page() {
        BrowserUtils.waitFor(10);
            Assert.assertTrue(activityStreamPage.uploadedFileText.getText()
                    .substring(0,fileName.length()).contains(fileName.substring(0,fileName.length()-4)));
            BrowserUtils.waitFor(5);
    }

    @Then("the workflow options should appear in the page")
    public void the_workflow_options_should_appear_in_the_page() {
        BrowserUtils.waitForPageToLoad(4);
        Assert.assertEquals(workflowOpenClassAtt,activityStreamPage.workflowPopUpMenu.getAttribute("class"));
    }

    @Then("the user enters valid data about the {string}")
    public void the_user_enters_valid_data_about_the(String data) {
        String text;
        BrowserUtils.waitForPageToLoad(3);
        Driver.get().switchTo().frame(activityStreamPage.iframe);
        switch (data){
            case "message"     :
                text=message;
                break;
            case "poll"        :
                text=pollText;
                break;
            case "appreciation":
                text=appreciationText;
            break;
            case "announcement":
                text=announcementText;
                break;
            default: text="Invalid text";
        }
        activityStreamPage.messageInputBox.sendKeys(text);
        Driver.get().switchTo().defaultContent();
    }

    @Then("the {string} should appear in the Activity Stream page")
    public void the_should_appear_in_the_Activity_Stream_page(String data) {
        String text;
        switch (data){
            case "sent message"     :
                text=message;
                break;
            case "created poll"        :
                text=pollText;
                break;
            case "created appreciation":
                text=appreciationText;
                break;
            case "created announcement":
                text=announcementText;
                break;
            default: text="Invalid text";
        }
        BrowserUtils.waitForPageToLoad(4);
        Assert.assertTrue(activityStreamPage.sentMessageText.getText().contains(text));
    }

    @Then("the user enters valid information about the {string}")
    public void the_user_enters_valid_information_about_the(String data) {
        String text;
        WebElement webElement;
        switch (data){
            case "task"     :
                text=taskText;
                webElement=activityStreamPage.taskInputBox;
                break;
            case "event":
                text=eventName;
                webElement=activityStreamPage.eventNameInputBox;
                break;
            default: text="Invalid text";
            webElement=null;
        }
        assert webElement != null;
        webElement.sendKeys(text);
    }

    @Then("the created {string} should appear in the Activity Stream page")
    public void the_created_should_appear_in_the_Activity_Stream_page(String data) {
        BrowserUtils.waitForPageToLoad(4);
        String text;
        WebElement webElement;
        switch (data){
            case "task"     :
                text=taskText;
                webElement=activityStreamPage.createdTaskText;
                break;
            case "event":
                text=eventName;
                webElement=activityStreamPage.createdEventText;
                break;
            default: text="Invalid text";
                webElement=null;
        }
        assert webElement != null;
        Assert.assertEquals(text,webElement.getText());
    }

}
