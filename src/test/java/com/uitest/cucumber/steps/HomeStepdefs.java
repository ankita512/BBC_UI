package com.uitest.cucumber.steps;

import com.uitest.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomeStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Search link$")
    public void iClickOnSearchLink() {
        new HomePage().clickOnSearchButton();
    }

    @And("^I enter \"([^\"]*)\" in search bar$")
    public void iEnterInSearchBar(String text)  {
        new HomePage().enterTermsInSearchBar(text);
    }

    @And("^I click on search icon Or press Enter key$")
    public void iClickOnSearchIconOrPressEnterKey() {
        new HomePage().clickOnSearchButton1();
    }

    @Then("^I can see the result \"([^\"]*)\"$")
    public void iCanSeeTheResult(String message)  {
        Assert.assertEquals(new HomePage().verifyMusicText(),message);
    }
}
