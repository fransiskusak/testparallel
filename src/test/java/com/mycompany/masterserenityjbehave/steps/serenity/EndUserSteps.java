package com.mycompany.masterserenityjbehave.steps.serenity;

import com.mycompany.masterserenityjbehave.pages.DashboardPage;
import com.mycompany.masterserenityjbehave.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;

public class EndUserSteps extends ScenarioSteps {

    HomePage homePage;
    DashboardPage dashboardPage;


    @Step
    public void beradaDiHomepage() {
        homePage.open();
    }

    @Step
    public void mengeklikBoxUsername() {
        homePage.klikUsername();
    }

    @Step
    public void mengetikUsername(String username) {
        homePage.ketikUsername(username);
    }

    @Step
    public void mengeklikBoxPassword() {
        homePage.klikPassword();
    }

    @Step
    public void mengetikPassword(String password) {
        homePage.ketikPassword(password);
    }

    @Step
    public void mengeklikLogin() {
        homePage.klikLogin();
    }

    @Step
    public void akanLihatNamaPengguna(String nama) {
        homePage.lihatNama().shouldContainText(nama);

    }

    @Step
    public void beradaDiDashboardpage() {
        dashboardPage.open();
    }

    @Step
    public void mengeklikBoxSearch() {
        dashboardPage.klikboxsearch();
    }

    @Step
    public void mengetikKeywordCourse(String keyword) {
        dashboardPage.ketikKeywordSearch(keyword);
    }

    @Step
    public void mengeklikCariCourse() {
        dashboardPage.cariCourse();
    }

    @Step
    public void menemukanBigData() {
        //String bodyText = getDriver().findElement(By.tagName("body")).getText();
        //Assert.assertTrue("Text not found!", bodyText.contains("Big Data"));
//dikomen 30 Nov di IF
        //String result = dashboardPage.temukanKeyword();
        //assertThat("course is not found", result , "Big Data");

    }

}
