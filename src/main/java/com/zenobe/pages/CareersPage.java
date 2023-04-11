package com.zenobe.pages;

import com.zenobe.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CareersPage.class.getName());

    public CareersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()='Job openings']")
    WebElement jobOpenings;

    @CacheLookup
    @FindBy(xpath = "//span[text()='All jobs']")
    WebElement allJobs;

    @CacheLookup
    @FindBy(xpath = "//span[text()='QA Engineer']")
    WebElement qaEngineer;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Apply here!']")
    WebElement applyButton;


    public void clickOnJobOpenings() {
        clickOnElement(jobOpenings);
    }

    public void clickOnAllJobsButton() throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", "//span[text()='Modeller']");
        clickOnElement(allJobs);
    }

    public void clickOnQAEngineerLink() throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", "//span[text()='Procurement Manager']");
        clickOnElement(qaEngineer);
    }

    public void clickOnApplyButton() {
        clickOnElement(applyButton);
    }

}
