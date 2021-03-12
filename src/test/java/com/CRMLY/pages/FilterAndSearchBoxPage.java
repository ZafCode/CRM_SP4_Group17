package com.CRMLY.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterAndSearchBoxPage extends BasePage{

    @FindBy(id = "LIVEFEED_search")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[1]/div[1]")
    public WebElement dateDropbox;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[2]/div[1]")
    public WebElement typeDropDown;

    @FindBy(xpath = "//input[@name='CREATED_BY_ID_label']")
    public WebElement inputAuthor;

    @FindBy(xpath = "//input[@name='TO_label']")
    public WebElement toBox;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addField;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_fields_popup\"]/div/div[6]/div")
    public WebElement tag;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[4]/span[2]/span[1]")
    public WebElement myActivity;

    @FindBy(xpath = "//span[@class='main-ui-filter-add-item']")
    public WebElement savefilterBtn;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement filterSearchBtn;

    @FindBy(id = "bp_137")
    public WebElement firstContent;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-new']")
    public WebElement toAllemployees;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[8]/input")
    public WebElement filterNameBox;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[2]/div/span")
    public WebElement resetBtn;



}
