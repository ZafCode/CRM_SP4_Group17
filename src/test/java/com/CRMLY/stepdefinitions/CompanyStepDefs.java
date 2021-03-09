package com.CRMLY.stepdefinitions;

import com.CRMLY.pages.CompanyPage;
import com.CRMLY.utilities.BrowserUtils;
import com.CRMLY.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CompanyStepDefs {
    @When("the user clicks on News button")
    public void the_user_clicks_on_News_button() {
        new CompanyPage().news.click();
    }

    @Then("the user should display News window")
    public void the_user_should_display_News_window() {
        Assert.assertTrue(Driver.get().getTitle().contains("Important information"));
    }

    @When("the user clicks on Add News button")
    public void the_user_clicks_on_Add_News_button() {
        new CompanyPage().addNews.click();
    }

    @Then("the user should display Add News window")
    public void the_user_should_display_Add_News_window() {
        Assert.assertTrue(new CompanyPage().titleAddNews.isDisplayed());
    }

    @Then("the user should display Official Information window")
    public void the_user_should_display_Official_Information_window() {
        CompanyPage companyPage = new CompanyPage();
        Assert.assertEquals("Company",companyPage.pageTitle.getText());
        Assert.assertTrue(companyPage.news.isDisplayed());
    }

    @Then("the user should display Our Life window")
    public void the_user_should_display_Our_Life_window() {
        Assert.assertEquals("Company life", new CompanyPage().pageTitle.getText());
    }

    @Then("the user should display About Company window")
    public void the_user_should_display_About_Company_window() {
        for (WebElement webElement : new CompanyPage().aboutComp) {
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    @Then("the user should display Photo Gallery Page")
    public void the_user_should_display_Photo_Gallery_Page() {
        Assert.assertEquals("Photo gallery", new CompanyPage().pageTitle.getText());
    }

    @Then("the user should display Video Player window")
    public void the_user_should_display_Video_Player_window() {
        Assert.assertEquals("Company", new CompanyPage().pageTitle.getText());
        Assert.assertTrue(new CompanyPage().video.isDisplayed());
    }

    @Then("the user should display Vacancy button")
    public void the_user_should_display_Vacancy_button() {
        Assert.assertTrue(new CompanyPage().vacancies.isDisplayed());
    }

    @Then("the user should display news under Business News\\(RSS) menu")
    public void the_user_should_display_news_under_Business_News_RSS_menu() {
        Assert.assertEquals("RSS Feed",new CompanyPage().rssTitle.getText());
        System.out.println(Driver.get().getCurrentUrl());
    }

    @When("the user navigate to {string} tab {string} module")
    public void the_user_navigate_to_tab_module(String string, String string2) {
        String tabLocator = "//a[@title='"+ string +"']";
        String moduleLocator = "//span[.='"+string2+"' and @class='main-buttons-item-text-title']";
        WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
        new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        new CompanyPage().moreButton.click();
        BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
        Driver.get().findElement(By.xpath(moduleLocator)).click();
    }

}
