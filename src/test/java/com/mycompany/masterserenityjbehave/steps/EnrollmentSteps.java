package com.mycompany.masterserenityjbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.mycompany.masterserenityjbehave.steps.serenity.EndUserSteps;

public class EnrollmentSteps {

    @net.thucydides.core.annotations.Steps
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

    @Then("Pengguna akan melihat Nama User yaitu F A Kristiawan P G S")
    public void akanMelihatNamaPengguna() {
//        endUser.akanMelihatNamaPengguna(nama);
    }



    @When("Pengguna mengeklik textboxt Search Courses")
    public void penggunaKlikBoxSearch(){endUser.mengeklikBoxSearch();}

    @When("Pengguna mengetik '$Big Data Komputasional'")
    public void penggunaKetikBigData(String keyword) {endUser.mengetikKeywordCourse(keyword);}

    @When("Pengguna mengeklik tombol cari")
    public void penggunaKlikCari(){endUser.mengeklikCariCourse();}

    @Then("Pengguna akan melihat Nama Matakuliah Big Data Komputasional")
    public void penggunaMelihatNamaMatakuliahBigData(){    }

}
