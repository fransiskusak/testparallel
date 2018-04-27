package com.mycompany.masterserenityjbehave.steps.serenity;

import com.mycompany.masterserenityjbehave.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;

public class EndUserSteps extends ScenarioSteps {

    HomePage homePage;
    DashboardPage dashboardPage;
    SearchResultPage searchResultPage;
    CourseHomePage  courseHomePage;
    RegisterPage    registerPage;
    ErrorLoginPage errorLoginPage;
    ProfilePage profilePage;

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
        homePage.lihatNama().shouldContainText(nama);}

/////////////////////////////////LOGIN INVALID PASSWORD//////////////////
    @Step
    public void mengetikInvalidPassword(String invalidpassword) {
        homePage.ketikInvalidPassword(invalidpassword);
    }

//    @Step
//    public void akanLihatPesanErrorLogin() {
//        boolean result = dashboardPage.labelCheck();
//        assertThat(result, equalTo(false));
//    }

    public void akanLihatPesanErrorLogin(String erorlogin) {
        errorLoginPage.lihatInvalidLogin().shouldContainText(erorlogin);

    }


/////////////////////////////////CARI COURSE VALID/////////////////////////////
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
    public void menemukanTulisanNamaMakulnya(String namaMakulnya) { searchResultPage.lihatHasilSearchCourse().shouldContainText(namaMakulnya);}


        //String bodyText = getDriver().findElement(By.tagName("body")).getText();
        //Assert.assertTrue("Text not found!", bodyText.contains("Big Data"));
//dikomen 30 Nov di IF
        //String result = dashboardPage.temukanKeyword();
        //assertThat("course is not found", result , "Big Data");




//////////////////////////////////LOGOUT/////////////////////////////
    @Step
    public void mengeklikNama() {homePage.klikNama();}

    @Step
    public void mengeklikLogout() {homePage.klikLogout();}

    @Step
    public void akanLihatTulisan(String isiTentangElok) {homePage.lihatTulisan().shouldContainText(isiTentangElok);}




//////////////////////////////////ENROLE COURSE/////////////////////
    @Step
    public void mengeklikTulisanNamaMakul() {searchResultPage.klikTulisanNamaMakul();}

    @Step
    public void mengeklikEnroll(){courseHomePage.enrollBigData();}

    @Step
    public void  akanLihatTulisanUnenroll(String tlsunenroll) {courseHomePage.temukanUnenroll().shouldContainText(tlsunenroll);}


///////////////////////////////////ENROLLMENT KEY/////////////////////////

    @Step
    public void mengeklikTulisanJarKom() {searchResultPage.klikTulisanNamaMakulJarkom();}

    @Step
    public void mengeklikTextboxEnrollmentKey(){courseHomePage.klikTextboxEnrollKey();}

    @Step
    public void mengetikEnrollmentKey(String key){courseHomePage.ketikEnrollmentKey(key);}

    @Step
    public void mengeklikTombolEnrollMe(){courseHomePage.klikEnrollMeJarkom();}


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
    public void akanLihatProfilnya(String deskripsiProfil) {dashboardPage.lihatProfil().shouldContainText(deskripsiProfil);}



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
    public void akanLihatMessages(String isimessages) {
        dashboardPage.lihatMessages().shouldContainText(isimessages);}

//////////////////////////MELIHAT SEMUA MATAKULIAH///////////////////////

    @Step
    public void mengeklikMatakuliah(){dashboardPage.klikTombolMatakuliah();}

    @Step
    public void akanLihatSemuaMatakuliah() {dashboardPage.lihatSemuaMatakuliah();}

///////////////////////////REGISTER SEBAGAI MAHASISWA/////////////////////

    @Step
    public void mengeklikTombolRegister(){homePage.klikRegister();}

    @Step
    public void mengeklikTextboxUsername(){registerPage.klikTombolUsername();}

    @Step
    public void memasukkanUsername(String registerusername){registerPage.masukkanUsername(registerusername);}

    @Step
    public void mengeklikLockPassword(){registerPage.klikLockPassword();}

    @Step
    public void mengeklikTextboxPassword(){registerPage.klikBoxPassword();}

    @Step
    public void memasukkanPassword(String registerpassword){registerPage.masukkanPassword(registerpassword);}

    @Step
    public void mengeklikTextboxEmail() {registerPage.klikEmail();}

    @Step
    public void memasukkanEmail(String email){registerPage.masukkanEmail(email);}

    @Step
    public void mengeklikTextboxEmailAgain(){registerPage.klikEmailAgain();}

    @Step
    public void memasukkanEmailAgain(String emailagain) {registerPage.masukkanEmailAgain(emailagain);}

    @Step
    public void  mengeklikTextboxFirstName(){registerPage.klikFirstName();}

    @Step
    public void memasukkanFirstName(String firstname) {registerPage.masukkanFirstName(firstname);}

    @Step
    public void mengeklikTextboxSurname(){registerPage.klikSurename();}

    @Step
    public void memasukkanSurname(String surename){registerPage.masukkanSurename(surename);}

    @Step
    public void mengeklikTextboxCity(){registerPage.klikCityTown();}

    @Step
    public void memasukkanCity(String citytown) {registerPage.klikCityTown();}

    @Step
    public void mengeklikTextboxCountry(){registerPage.klikDropdownCountry();}

    @Step
    public void mengeklikCreate(){registerPage.klikCreate();}

    @Step
    public void menselectNegaraIndonesia(String negara){registerPage.selectNegara(negara);}

    @Step
    public void akanMelihatKonfirmasiRegistrasi(String berhasil) {registerPage.akanLihatKonfirmasi().shouldContainText(berhasil);}

///////////////////////////MENGEDIT PROFIL/////////////////////

    @Step
    public void mengeklikTombolEditProfile(){profilePage.klikTombolEditProfile();}

    @Step
    public void mengeklikFieldFirstNameEdit() {profilePage.klikBoxFirstNameEdit();}

    @Step
    public void memasukkanFirstNameEdit(String firstnameedit){profilePage.masukkanBoxFirstName(firstnameedit);}

    @Step
    public void mengeklikFieldSurnameEdit(){profilePage.klikBoxSurnameEdit();}

    @Step
    public void memasukkanFieldSurnameEdit(String surnameedit){profilePage.masukkanBoxSurname(surnameedit);}

    @Step
    public void mengeklikFieldEmailEdit(){profilePage.klikBoxEmailAddressEdit();}

    @Step
    public void memasukkanFieldEmailEdit(String emailedit){profilePage.masukkanEmailAddress(emailedit);}

    @Step
    public void mengeklikFieldEmailDisplay(){profilePage.klikBoxEmailDisplayEdit();}

    @Step
    public void memilihFieldEmailDisplay(){profilePage.klikIsiSelectboxEmailDisplayEdit();}

    @Step
    public void mengeklikFieldCityEdit(){profilePage.klikBoxCityEdit();}

    @Step
    public void memasukkanFieldCityEdit(String cityedit){profilePage.masukkanCity(cityedit);}

    @Step
    public void mengeklikFieldCountryEdit(){profilePage.klikBoxCountryEdit();}

    @Step
    public void memilihIsiFieldCountryEdit(){profilePage.klikSelectIsiBoxCountry();}

    @Step
    public void mengeklikFieldTimezoneEdit(){profilePage.klikBoxTimezoneEdit();}

    @Step
    public void memilihIsiTimezoneJakarta(){profilePage.klikSelectIsiBoxTimezone();}

    @Step
    public void mengelikFieldDescriptionEdit(){profilePage.klikBoxDescriptionEdit();}

    @Step
    public void memasukkanFieldDescriptionEdit(String descriptionedit){profilePage.masukkanDescription(descriptionedit);}

    @Step
    public void mengeklikTombolUpdateProfil(){profilePage.klikTombolUpdateProfil();}

    @Step
    public void akanLihatNamaBaruPengguna(String namaakunteredit) {
        homePage.lihatNama().shouldContainText(namaakunteredit);
    }

    ////////////////////UNENROLL////////////////////////////////////////

    @Step
    public void mengeklikUnenroll(){courseHomePage.unenroll();}

    @Step
    public void mengeklikContinue() {courseHomePage.klikContinue();}

    @Step
    public void tidakMenemukanListMatakuliah(String listbigdata) {
        //courseHomePage.tidakMenemukanListMatakuliah().shouldNotContainText(listbigdata);
        }
}
