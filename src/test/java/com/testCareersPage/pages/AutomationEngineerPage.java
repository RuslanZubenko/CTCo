package com.testCareersPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AutomationEngineerPage extends BasePage {

    public AutomationEngineerPage(WebDriver driver) {super(driver);}
    private  By skillList = By.xpath("//ul[5]/li");

    public int getSkillsCount() {
        return driver.findElements(skillList).size();
    }

    public void waitPageLoading() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skillList));

    }

}
