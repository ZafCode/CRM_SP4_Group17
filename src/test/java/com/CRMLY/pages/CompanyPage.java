package com.CRMLY.pages;

import com.CRMLY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage {

    public CompanyPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//span[.='News']")
    public WebElement news;

    @FindBy(xpath = "//span[.='Add News']")
    public WebElement addNews;

    @FindBy(id = "adm-title")
    public WebElement titleNews;

    @FindBy(xpath = "//span[.='Important information: News: New element']")
    public WebElement titleAddNews;

    @FindBy(id = "pagetitle")
    public WebElement pageTitle;

    @FindBy(className = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> aboutComp;

    @FindBy(xpath = "//span[.='Video' and @class='webform-small-button-text']")
    public WebElement video;

    @FindBy(xpath = "//span[.='Vacancies']")
    public WebElement vacancies;

    @FindBy(xpath = "//div[.='RSS Feed']")
    public WebElement rssTitle;

    @FindBy(xpath = "//a/span[.='More' and @class='main-buttons-item-text']")
    public WebElement moreButton;

}
