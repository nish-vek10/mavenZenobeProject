package com.zenobe.pages;

import com.zenobe.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='cookie_action_close_header']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='menu-1-c6a4cde']/li")
    List<WebElement> topMenuTabs;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Electric Fleets']")
    WebElement headerTextElectric;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Second-life Batteries']")
    WebElement headerTextBatteries;

    @CacheLookup
    @FindBy(xpath = "//div[@class='elementor-icon-wrapper']/a")
    WebElement moreOptions;

    @CacheLookup
    @FindBy(xpath = "//a[@id='about-us']")
    WebElement aboutUs;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Careers']")
    WebElement careers;

    //Accept Cookies
    public void clickOnAcceptCookies() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(acceptCookies);
    }

    //Select tab from Top Menu Tabs
    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuTabs) {
            if (menu.getText().equalsIgnoreCase(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    public String getHeaderTextElectric() {
        String headText = getTextFromElement(headerTextElectric);
        return headText;
    }

    public String getHeaderTextBatteries() {
        String headText = getTextFromElement(headerTextBatteries);
        return headText;
    }

    public void clickOnExtraOptions() {
        clickOnElement(moreOptions);
    }

    public void clickOnAboutUs() {
        clickOnElement(aboutUs);
    }

    public void clickOnCareers() {
        clickOnElement(careers);
    }
}

