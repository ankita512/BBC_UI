package com.uitest.cucumber.steps;

import com.uitest.pages.ProgrammeInfo;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ProgInfoStepdefs {
    @Given("^I am on Programme information page$")
    public void iAmOnProgrammeInformationPage() {
        new ProgrammeInfo().clickOnAboutBBC();
        new ProgrammeInfo().clickOnMediaCentreTab();
        new ProgrammeInfo().clickOnProgrammeInformationTab();
    }

    @When("^I click on Search PI button$")
    public void iClickOnSearchPIButton() {
        new ProgrammeInfo().clickOnSearchPIButton();
    }

    @And("^I select medium from \"([^\"]*)\" Dropdown menu$")
    public void iSelectMediumFromDropdownMenu(String medium)  {
        new ProgrammeInfo().selectMediumOptionFromDropdown(medium);
    }

    @And("^I select channel from \"([^\"]*)\" Dropdown menu$")
    public void iSelectChannelFromDropdownMenu(String channel)  {
        new ProgrammeInfo().selectChannelOptionFromDropdown(channel);
    }

    @And("^I select genre from \"([^\"]*)\" Dropdown menu$")
    public void iSelectGenreFromDropdownMenu(String genre)  {
        new ProgrammeInfo().selectGenreOptionFromDropdown(genre);
    }

    @And("^I select option from \"([^\"]*)\" Dropdown menu$")
    public void iSelectOptionFromDropdownMenu(String week)  {
        new ProgrammeInfo().selectWeekFromDropdown(week);
    }

    @And("^I select day from \"([^\"]*)\" Dropdown menu$")
    public void iSelectDayFromDropdownMenu(String day)  {
        new ProgrammeInfo().selectDayFromDropdown(day);
    }

    @And("^I click on Submit button$")
    public void iClickOnSubmitButton() {
        new ProgrammeInfo().clickOnSubmitButton();
    }

    @Then("^I can see the result \"([^\"]*)\" according to filter\\.$")
    public void iCanSeeTheResultAccordingToFilter(String message)  {
        Assert.assertEquals(new ProgrammeInfo().verifyFilterMessage(message),message);
    }


    @And("^I select network from \"([^\"]*)\" Dropdown menu$")
    public void iSelectNetworkFromDropdownMenu(String network)  {
        new ProgrammeInfo().selectNetworkFromDropdown(network);
    }
}
