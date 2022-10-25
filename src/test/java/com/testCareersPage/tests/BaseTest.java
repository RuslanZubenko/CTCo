package com.testCareersPage.tests;

import com.testCareersPage.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected MainPage mainPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ctco.lv/en");
        mainPage = new MainPage(driver);
    }


    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }



}
