package com.testCareersPage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By careersButton = By.xpath("//a[contains(text(),'Careers')]");
    private By vacanciesButton = By.id("menu-item-131");

    public void clickCareersButton() {
        driver.findElement(careersButton).click();
    }

    public VacanciesPage clickVacanciesButton() {
        driver.findElement(vacanciesButton).click();
        return new VacanciesPage(driver);
    }

}
