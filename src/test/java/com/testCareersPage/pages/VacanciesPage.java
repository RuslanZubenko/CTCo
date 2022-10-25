package com.testCareersPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VacanciesPage extends BasePage {

    public VacanciesPage(WebDriver driver) {
        super(driver);
    }

    private By automationButton = By.id("menu-item-5079");

    public AutomationEngineerPage clickAutomationButton() {
        driver.findElement(automationButton).click();
        return new AutomationEngineerPage(driver);
    }

    public void waitPageLoading() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(automationButton));
    }

}
