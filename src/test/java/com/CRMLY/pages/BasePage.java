package com.CRMLY.pages;

import com.CRMLY.utilities.BrowserUtils;
import com.CRMLY.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "pagetitle")
    public List<WebElement> pageTitle;

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(css = "[class='menu-popup-item-text']")
    public List<WebElement> menuPopUpItems;

    @FindBy(css="[class='menu-item-link-text']")
    public List<WebElement> modules;

    @FindBy(css = "[class='menu-favorites-more-text']")
    public List<WebElement> moreModuleList;

    @FindBy(id = "user-name")
    public WebElement userDropDownMenu;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logOutOption;



    public void navigateToModule(String tab, String module) {
        String tabLocator = "//a[@title='"+ tab +"']";
        String moduleLocator = "//span[.='"+module+"' and @class='main-buttons-item-text-title']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  5);
        }
    }

    public void selectOptionFromUserDropDownMenu(){

        userDropDownMenu.click();
        logOutOption.click();

    }

    public void manageDropdown(List<WebElement> webElementList, String tabText){
        try {
            if(moreModuleList.size()!=0){
                moreModuleList.get(0).click();
            }
            for (WebElement webElement : webElementList) {
                if (webElement.getText().equals(tabText)){
                    webElement.click();
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public WebElement getWebElementFromWebElementList(List<WebElement> webElementList,String webElementText){
        WebElement resultWebElement= null;
        try {
            for (WebElement webElement : webElementList) {
                if (webElement.getText().equals(webElementText)){
                     resultWebElement=webElement;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultWebElement;
    }





}
