package com.testCareersPage.tests;
import com.testCareersPage.pages.AutomationEngineerPage;
import com.testCareersPage.pages.VacanciesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCareersPage extends BaseTest {

    @Test
    public void testCountSkills () {

        mainPage.clickCareersButton();

        VacanciesPage vacanciesPage = mainPage.clickVacanciesButton();
        vacanciesPage.waitPageLoading();

        AutomationEngineerPage automationEngineerPage = vacanciesPage.clickAutomationButton();
        automationEngineerPage.waitPageLoading();

        Assert.assertEquals(automationEngineerPage.getSkillsCount(), 8);
    }

}
