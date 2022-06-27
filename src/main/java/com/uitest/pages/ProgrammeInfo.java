package com.uitest.pages;

import com.uitest.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgrammeInfo extends Utility {

    private static final Logger log = LogManager.getLogger(ProgrammeInfo.class.getName());
    public ProgrammeInfo() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'About the BBC')]")
    WebElement aboutBBC;

    @CacheLookup
    @FindBy(xpath = "//a[@class='sc-hKgJUU sc-fKFxtB ivrSzm hYYNNn clickable primary']//span[text()='Media Centre']")
    WebElement mediaCenterTab;

    @CacheLookup
    @FindBy(xpath = "//a[@class='sc-hKgJUU sc-fKFxtB ivrSzm hYYNNn clickable primary']//span[text()='Programme information']")
    WebElement programmeInformation;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Search PI')]")
    WebElement searchPI;

    @CacheLookup
    @FindBy(xpath = "//select[@id='medium']")
    WebElement mediumDropdown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='channel']")
    WebElement channelDropdown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='genre']")
    WebElement genreDropdown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='week']")
    WebElement weekDropdown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='day']")
    WebElement dayDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[@class='sc-hKgJUU ivrSzm clickable primary wide']")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'No programmes were found using the selected filter')]")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy(xpath = "//select[@id='network']")
    WebElement networkDropdown;

    public void clickOnAboutBBC(){
        clickOnElement(aboutBBC);
     log.info("Clicking On About BBC" +aboutBBC);
    }

    public void clickOnMediaCentreTab(){
        clickOnElement(mediaCenterTab);
    log.info("Clicking On Media Centre Tab" +mediaCenterTab);
    }

    public void clickOnProgrammeInformationTab(){
        clickOnElement(programmeInformation);
    log.info("Clicking On Programme information" +programmeInformation);
    }

    public void clickOnSearchPIButton(){
        clickOnElement(searchPI);
     log.info("Click On Search PI Button" +searchPI);
    }

    public void selectMediumOptionFromDropdown(String value){
        selectByValueFromDropDown(mediumDropdown,value);
     log.info("Select Medium Option" +mediumDropdown);
    }

    public void selectChannelOptionFromDropdown(String value){
        selectByValueFromDropDown(channelDropdown,value);
     log.info("Selecting On Channel Option" +channelDropdown);
    }
    public void selectGenreOptionFromDropdown(String value){
        selectByValueFromDropDown(genreDropdown,value);
     log.info("Select On Genre Option" +genreDropdown);
    }
    public void selectWeekFromDropdown(String value){
        selectByValueFromDropDown(weekDropdown,value);
     log.info("Selecting Week From DropDown" +weekDropdown);
    }
    public void selectDayFromDropdown(String value){
        selectByValueFromDropDown(dayDropdown,value);
    log.info("Select On Date From Dropdown" +dayDropdown);
    }

    public void selectNetworkFromDropdown(String value){
        selectByValueFromDropDown(networkDropdown,value);
    log.info("Select On Network" +networkDropdown);
    }
    public void clickOnSubmitButton (){
        clickOnElement(submitButton);
    log.info("Click On Submit Button" +submitButton);
    }

    public String verifyFilterMessage(String message){
    log.info("Verify Filter Message" +verifyMessage);
        return getTextFromElement(verifyMessage);
    }
}
