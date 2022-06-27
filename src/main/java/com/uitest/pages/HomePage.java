package com.uitest.pages;

import com.uitest.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Search BBC')]")
    WebElement search;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-input']")
    WebElement searchBar;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement resultMusic;

    @CacheLookup
    @FindBy(xpath = "//button[@class='ssrcss-8fvdsf-Button etotop31']")
    WebElement searchButton;


    public void clickOnSearchButton() {
        clickOnElement(search);
        log.info("Clicking On Search button" +search);
    }

    public void enterTermsInSearchBar(String text){
        sendTextToElement(searchBar,text);
        log.info("Enter Terms in SearchBar" +searchBar);
    }

    public void clickOnSearchButton1() {
        clickOnElement(searchButton);
        log.info("Clicking On Search button" +searchButton);
    }

    public String verifyMusicText(){
        System.out.println(getTextFromElement(resultMusic));
        log.info("Verify Music Text" +resultMusic);
        return getTextFromElement(resultMusic);
    }


}