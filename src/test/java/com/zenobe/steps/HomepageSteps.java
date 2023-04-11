package com.zenobe.steps;

import com.zenobe.pages.ElectricFleetsPage;
import com.zenobe.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomepageSteps {

    //Create objects
    HomePage homePage = new HomePage();
    ElectricFleetsPage electricFleetsPage = new ElectricFleetsPage();

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User accepts cookies$")
    public void userAcceptsCookies() throws InterruptedException {
        homePage.clickOnAcceptCookies();
    }

    @And("^User clicks on Electric Fleets tab from the top menu tabs$")
    public void userClicksOnElectricFleetsTabFromTheTopMenuTabs() {
        homePage.clickOnMenuTab("Electric Fleets");
    }

    @Then("^User should navigate to the Electric Fleets page and verify header text successfully$")
    public void userShouldNavigateToTheElectricFleetsPageAndVerifyHeaderTextSuccessfully() {
        String actualMsg = homePage.getHeaderTextElectric(); //Get text from page
        String expectedMsg = "Electric Fleets"; //Expected Message
        Assert.assertEquals(actualMsg, expectedMsg, "Electric Fleets Page Verified!"); //Compare and Verify test
    }

    @And("^User clicks on Second-life batteries tab from the top menu tabs$")
    public void userClicksOnSecondLifeBatteriesTabFromTheTopMenuTabs() {
        homePage.clickOnMenuTab("Second-life batteries");
    }

    @Then("^User should navigate to the Second-life batteries page and verify header text successfully$")
    public void userShouldNavigateToTheSecondLifeBatteriesPageAndVerifyHeaderTextSuccessfully() {
        String actualMsg = homePage.getHeaderTextBatteries(); //Get text from page
        String expectedMsg = "Second-life Batteries"; //Expected Message
        Assert.assertEquals(actualMsg, expectedMsg, "Second-life Batteries Page Verified!"); //Compare and Verify test
    }
}
