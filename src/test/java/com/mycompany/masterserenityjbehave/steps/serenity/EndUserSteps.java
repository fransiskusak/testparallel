package com.mycompany.masterserenityjbehave.steps.serenity;

import com.mycompany.masterserenityjbehave.pages.CourseHomePage;
import com.mycompany.masterserenityjbehave.pages.DashboardPage;
import com.mycompany.masterserenityjbehave.pages.HomePage;
import com.mycompany.masterserenityjbehave.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;

public class EndUserSteps extends ScenarioSteps {

    HomePage homePage;
    DashboardPage dashboardPage;
    SearchResultPage    searchResultPage;
    CourseHomePage  courseHomePage;

//////////////////////////////LOGIN/////////////////////////////
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


/////////////////////////////////CARI COURSE/////////////////////////////
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



//////////////////////////////////LOGOUT/////////////////////////////
    @Step
    public void mengeklikNama() {homePage.klikNama();}

    @Step
    public void mengeklikLogout() {homePage.klikLogout();}

    @Step
    public void akanLihatTulisan() {homePage.lihatTulisan();}




//////////////////////////////////ENROLE COURSE/////////////////////
    @Step
    public void mengeklikTulisanBigData() {searchResultPage.klikTulisanBigData();}

    @Step
    public void mengeklikEnroll(){courseHomePage.enroll();}

    @Step
    public void  akanLihatTulisanUnenroll() {courseHomePage.temukanUnenroll();}



////////////////////////////////MELIHAT PROFIL///////////////////////////

    @Step
    public void beradaDiDashboardpage2() {
        dashboardPage.open();
    }

    @Step
    public void mengeklikNama2() {homePage.klikNama();}

    @Step
    public void mengeklikTombolProfil() {dashboardPage.klikTombolProfil();}

    @Step
    public void akanLihatProfilnya() {dashboardPage.lihatProfil();}



//////////////////////////////////MELIHAT GRADE///////////////////////////

    @Step
    public void beradaDiDashboardpage3() {
        dashboardPage.open();
    }

    @Step
    public void mengeklikGrade() {dashboardPage.klikTombolGrade();}

    @Step
    public void akanLihatGrade() {dashboardPage.lihatGrade();}


/////////////////////////////////MELIHAT MESSAGES//////////////////////////

    @Step
    public void beradaDiDashboardpage4() {
        dashboardPage.open();
    }

    @Step
    public void mengeklikMessages(){dashboardPage.klikTombolMessages();}

    @Step
    public void akanLihatMessages() {dashboardPage.lihatMessages();}

//////////////////////////MELIHAT SEMUA MATAKULIAH///////////////////////

    @Step
    public void mengeklikMatakuliah(){dashboardPage.klikTombolMatakuliah();}

    @Step
    public void akanLihatSemuaMatakuliah() {dashboardPage.lihatSemuaMatakuliah();}

}
