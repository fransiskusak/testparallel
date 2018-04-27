package com.mycompany.masterserenityjbehave.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

import com.mycompany.masterserenityjbehave.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("Pengguna berada pada Homepage e-LOK")
    public void penggunaBeradaPadaHomepage() {
        endUser.beradaDiHomepage();
    }

    @Given("Pengguna berada pada Halaman Dashboard e-LOK")
    public void penggunaBeradaPadaHalamanDashboard() {endUser.beradaDiDashboardpage();}

    @When("Pengguna mengeklik textboxt Username")
    public void penggunaMengeklikBoxUsername() {
        endUser.mengeklikBoxUsername();
    }

    @When("Pengguna mengetik usernamenya '$username'")
    public void penggunaMengetikUsername(String username) {endUser.mengetikUsername(username);}

    @When("Pengguna mengeklik textboxt Password")
    public void penggunaMengeklikBoxPassword() {endUser.mengeklikBoxPassword();}

    @When("Pengguna mengetik passwordnya '$password'")
    public void penggunaMengetikPassword(String password) {endUser.mengetikPassword(password);}

    @When("Pengguna mengeklik tombol login")
    public void penggunaMengeklikLogin(){endUser.mengeklikLogin();}

    @Then("Pengguna akan melihat Nama User yaitu '$nama'")
    public void akanMelihatNamaPengguna(String nama) {endUser.akanLihatNamaPengguna(nama);}

////////////////////////LOGIN INVALID PASSWORD////////////////////////////


    @When("Pengguna mengetik passwordnya '$invalidpassword'")
    public void penggunaMengetikInvalidPassword(String invalidpassword) {endUser.mengetikInvalidPassword(invalidpassword);}

    @Then("Pengguna akan melihat pesan eror yaitu '$erorlogin'")
    public void akanMelihatErrorLogin(String erorlogin) {endUser.akanLihatPesanErrorLogin(erorlogin);}

////////////////////////////////SEARCH MAKUL BERDASAR KEYWORD////////////////////////////////////////
    @When("Pengguna mengeklik textboxt Search Courses")
    public void penggunaKlikBoxSearch(){endUser.mengeklikBoxSearch();}

    @When("Pengguna mengetik '$keyword'")
    public void penggunaKetikBigData(String keyword) {endUser.mengetikKeywordCourse(keyword);}

    @When("Pengguna mengeklik tombol cari")
    public void penggunaKlikCari(){endUser.mengeklikCariCourse();}

    @Then("Pengguna akan melihat Nama Matakuliah yaitu '$judulMakul'")
    public void penggunaMelihatNamaMatakuliahNya(String judulMakul){endUser.menemukanTulisanNamaMakulnya(judulMakul);}


///////////////////////////ENROLL OPEN MOOC////////////////////////////////////////////////

    @When("Pengguna mengeklik judul Big Data Komputasional")
    public void penggunaMengeklikBigData(){endUser.mengeklikTulisanNamaMakul();}

    @When("Pengguna klik tombol enroll me")
    public void penggunaMengeklikEnroll(){endUser.mengeklikEnroll();}

    @Then("Terdapat menu '$tlsunenroll'")
    public void penggunaMelihatTombolEnroll(String tlsunenroll){endUser.akanLihatTulisanUnenroll(tlsunenroll);}


//////////////////////////////ENROLL ENROLLMENT KEY/////////////////////////////////

    @When("Pengguna mengeklik judul matakuliah Jaringan Komputer")
    public void penggunaMengeklikJaringanKomputer(){endUser.mengeklikTulisanJarKom();}

    @When("Pengguna mengeklik textbox untuk memasukkan enrollment key")
    public void penggunaMengeklikTextboxEnrollmentkey(){endUser.mengeklikTextboxEnrollmentKey();}

    @When("Pengguna mengetik enrollment key '$key'")
    public void penggunaMengetikEnrollmentKey(String key) {endUser.mengetikEnrollmentKey(key);}

    @When("Pengguna mengeklik tombol enroll me")
    public void penggunaMengeklikTombolEnrollMeJarkom(){endUser.mengeklikTombolEnrollMe();}


// ///////////////////////////////////////////////////////////////////////



    @When("Pengguna mengeklik nama")
    public void penggunaKlikNama(){endUser.mengeklikNama();}

    @When("Pengguna mengeklik Logout")
    public void penggunaKlikLogout(){endUser.mengeklikLogout();}

    @Then("Pengguna akan melihat deskripsi '$isiTentangElok'")
    public void penggunaLihatTulisanDiHomepage(String isiTentangElok){endUser.akanLihatTulisan(isiTentangElok);}


/////////////////////////////////////////////////////////////////////////

    @When("Pengguna mengeklik tombol profil")
    public void penggunaKlikProfil(){endUser.mengeklikTombolProfil();}

    @Then("Pengguna akan melihat deskripsi '$deskripsiProfil' di halaman profil")
    public void penggunaAkanMelihatProfilnya(String deskripsiProfil) {endUser.akanLihatProfilnya(deskripsiProfil);}


    @When("Pengguna mengeklik tombol grade")
    public void penggunaMengeklikTombolGrade() {endUser.mengeklikGrade();}

    @Then("Pengguna akan melihat nilai-nilai nya")
    public void penggunaAkanMelihatGrade() {endUser.akanLihatGrade();}

/////////////////////////////////////////////////////////////////////////

    @When("Pengguna mengeklik tombol messages")
    public void penggunaMengeklikTombolMessages() {endUser.mengeklikMessages();}

    @Then("Pengguna akan melihat messages-nya '$isimessages'")
    public void penggunaAkanMelihatMessagesnya(String isimessages) {endUser.akanLihatMessages(isimessages);}

/////////////////////////////////////////////////////////////////////////

    @When("Pengguna mengeklik tombol Matakuliah")
    public void penggunaMengeklikTombolMatakuliah() {endUser.mengeklikMatakuliah();}

    @Then("Pengguna akan melihat semua matakuliah yang tersedia")
    public void penggunaAkanMelihatSemuaMatakuliah() {endUser.akanLihatSemuaMatakuliah();}

//////////////////////////REGISTER USER//////////////////////////////////

    @When("Pengguna mengeklik tombol register")
    public void penggunaMengeklikTombolRegister(){endUser.mengeklikTombolRegister();}

    @When("Pengguna mengklik textbox Username")
    public void penggunaMengklikTextboxUsername(){endUser.mengeklikTextboxUsername();}

    @When("Pengguna memasukkan username '$registerusername'")
    public void penggunaMemasukkanUsername(String registerusername){endUser.memasukkanUsername(registerusername);}

    @When("Pengguna mengeklik lock password")
    public void penggunaMengeklikLockPasword(){endUser.mengeklikLockPassword();}

    @When("Pengguna mengklik textbox Password")
    public void penggunaMengklikTextboxPassword(){endUser.mengeklikTextboxPassword();}

    @When("Pengguna memasukkan password '$registerpassword'")
    public void penggunaMemasukkanPassword(String registerpassword){endUser.memasukkanPassword(registerpassword);}

    @When("Pengguna mengeklik textbox Email")
    public void penggunaMengeklikTextboxEmail(){endUser.mengeklikTextboxEmail();}

    @When("Pengguna memasukkan Email '$email'")
    public void penggunaMemasukkanEmail(String email){endUser.memasukkanEmail(email);}

    @When("Pengguna mengeklik textbox Email (again)")
    public void penggunaMengeklikTextboxEmailAgain(){endUser.mengeklikTextboxEmailAgain();}

    @When("Pengguna memasukkan Email (again) '$emailagain'")
    public void penggunaMemasukkanTextboxEmailAgain(String emailagain){endUser.memasukkanEmailAgain(emailagain);}

    @When("Pengguna mengeklik textbox First name")
    public void penggunaMengeklikTextboxFirstName(){endUser.mengeklikTextboxFirstName();}

    @When("Pengguna memasukkan First name '$firstname'")
    public void penggunaMemasukkanFirstName(String firstname){endUser.memasukkanFirstName(firstname);}

    @When("Pengguna mengeklik textbox Surname")
    public void penggunaMengeklikTextboxSurname(){endUser.mengeklikTextboxSurname();}

    @When("Pengguna memasukkan Surname '$surname'")
    public void PenggunaMemasukkanSurname(String surname){endUser.memasukkanSurname(surname);}

    @When("Pengguna mengeklik textbox City")
    public void penggunaMengeklikTextboxCity(){endUser.mengeklikTextboxCity();}

    @When("Pengguna memasukkan City '$city'")
    public void penggunaMemasukkanCity(String city){endUser.memasukkanCity(city);}

    @When("Pengguna mengeklik textbox Country")
    public void penggunaMengeklikTextboxCountry(){endUser.mengeklikTextboxCountry();}

    @When("Pengguna mengeklik tombol Create")
    public void penggunaMengeklikCreate() {endUser.mengeklikCreate();}

    @When("Pengguna mengeklik Negara '$negara'")
    public void penggunaMengeklikNegaraIndonesia(String negara ){endUser.menselectNegaraIndonesia(negara);}

    @Then("Pengguna akan melihat konfirmasi '$berhasil'")
    public void penggunaAkanMelihatKonfirmasi(String berhasil){endUser.akanMelihatKonfirmasiRegistrasi(berhasil);}

//////////////////////////REGISTER USER//////////////////////////////////

    @When("Pengguna mengeklik tombol Edit profile")
    public void penggunaMengeklikEditProfile(){endUser.mengeklikTombolEditProfile();}

    @When("Pengguna mengeklik field First name")
    public void penggunaMengeklikFieldFirstName(){endUser.mengeklikFieldFirstNameEdit();}

    @When("Pengguna memasukkan '$firstnameedit' ke field First name")
    public void penggunaMemasukkanFieldFirstName(String firstnameedit ){endUser.memasukkanFirstNameEdit(firstnameedit);}

    @When("Pengguna mengeklik field Surname")
    public void penggunaMengeklikFieldSurname(){endUser.mengeklikFieldSurnameEdit();}

    @When("Pengguna memasukkan '$surnameedit' ke field Surname")
    public void penggunaMemasukkanFieldSurname(String surnameedit){endUser.memasukkanFieldSurnameEdit(surnameedit);}

    @When("Pengguna mengeklik field Email address")
    public void penggunaMengeklikFieldEmailAddress(){endUser.mengeklikFieldEmailEdit();}

    @When("Pengguna memasukkan '$emailedit' ke field Email address")
    public void penggunaMemasukkanFieldEmailAddress(String emailedit){endUser.memasukkanFieldEmailEdit(emailedit);}

    @When("Pengguna mengeklik field Email display")
    public void penggunaMengeklikFieldEmailDisplay(){endUser.mengeklikFieldEmailDisplay();}

    @When("Pengguna mengeklik pilihan Allow everyone to see my email address")
    public void penggunaMengeklikPilihanAllowEveryone(){endUser.memilihFieldEmailDisplay();}

    @When("Pengguna mengeklik field City/Town")
    public void penggunaMengeklikFieldCity(){endUser.mengeklikFieldCityEdit();}

    @When("Pengguna memasukkan '$citytownedit' ke field City/Town")
    public void penggunaMemasukkanFieldCity(String citytownedit){endUser.memasukkanFieldCityEdit(citytownedit);}

    @When("Pengguna mengeklik field Country")
    public void penggunaMengeklikFieldCountry(){endUser.mengeklikFieldCountryEdit();}

    @When("Pengguna mengeklik pilihan Indonesia")
    public void penggunaMengeklikPilihanIndonesia(){endUser.memilihIsiFieldCountryEdit();}

    @When("Pengguna mengeklik field Timezone")
    public void penggunaMengeklikFieldTimezone(){endUser.mengeklikFieldTimezoneEdit();}

    @When("Pengguna mengeklik pilihan Server timezone (Asia/Jakarta)")
    public void penggunaMengeklikPilihanTimezone(){endUser.memilihIsiTimezoneJakarta();}

    @When("Pengguna mengeklik field Description")
    public void penggunaMengeklikFieldDescription(){endUser.mengelikFieldDescriptionEdit();}

    @When("Pengguna memasukkan '$descedit' ke field Description")
    public void penggunaMemasukkanFieldDescription(String descedit){endUser.memasukkanFieldDescriptionEdit(descedit);}

    @When("Pengguna mengeklik tombol update profil")
    public void penggunaMengeklikTombolUpdateProfil(){endUser.mengeklikTombolUpdateProfil();}

    @Then("Pengguna melihat nama akunnya menjadi '$namaakunteredit'")
    public void penggunaAkanMelihatNamaAkunnyaBerubah(String namaakunteredit ){endUser.akanLihatNamaBaruPengguna(namaakunteredit);}



    @When("Pengguna mengeklik tombol unenroll")
    public void penggunaMengeklikUnenroll() {endUser.mengeklikUnenroll();}

    @When("Pengguna mengeklik continue")
    public void penggunaMengeklikContnue(){endUser.mengeklikContinue();}

    @Then("Pengguna tidak menemukan List Matakuliah bernama '$listbigdata'")
    public void penggunaTidakMenemukanListMatakuliah(String listbigdata){endUser.tidakMenemukanListMatakuliah(listbigdata);}
//    @AfterScenario
//    public void afterScenario() {
//        driver.quit();
//    }
}
