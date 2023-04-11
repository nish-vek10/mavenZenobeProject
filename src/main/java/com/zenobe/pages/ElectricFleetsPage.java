package com.zenobe.pages;

import com.zenobe.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectricFleetsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ElectricFleetsPage.class.getName());

    public ElectricFleetsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Electric Fleets']")
    WebElement headerText;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='I want to electrify my fleet - where do I start?']")
    WebElement electrifyMyFleet;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Discover']")
    WebElement discoverButton;

    public String getHeaderText() {
        String headText = getTextFromElement(headerText);
        return headText;
    }

    public void clickOnDiscoverButton() throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", electrifyMyFleet);
        clickOnElement(discoverButton);
    }
}
