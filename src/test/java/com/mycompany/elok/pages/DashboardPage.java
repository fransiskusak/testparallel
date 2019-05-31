package com.mycompany.elok.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.yecht.Data;

/**
 * Created by Fransiskus A K on 13/11/2017.
 */
@DefaultUrl("https://elok.ugm.ac.id/my/")
public class DashboardPage extends PageObject {


    @FindBy(xpath = "html/body/div[1]/div[2]/header[2]/nav/div/div/form/input[1]")
    private WebElementFacade textboxSearch;

    @FindBy(xpath = "html/body/div[1]/div[2]/header[2]/nav/div/div/form/input[2]")
    private WebElementFacade tombolCari;

    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/div/div[3]/div/ul[2]/li[3]/a")
    private WebElementFacade tombolProfil;

    @FindBy(className = "menu-action-text")
    private WebElementFacade tombolGrade;

    ///////////////////////////////MESSAGE////////////////////////////////

    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/div/div[3]/div/ul[2]/li[5]/a/span")
    private WebElementFacade tombolMessages;


    @FindBy(className = "text"
            //"html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div/div/div[2]/div[2]/div[2]/div/span[1]/p"
            )
    private WebElementFacade isiMessages;


    //////////////////////////////////////////////////////////////////////


    @FindBy(xpath = "html/body/div[1]/div[2]/header[2]/nav/div/div/ul[1]/li[1]/a")
    private WebElementFacade tombolMatakuliah;

    @FindBy(className = "usertext")
    private WebElementFacade labelNama;


    private String label = "usertext";


    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/div/div/div[3]/div/div[1]/form/div/input[1]")
    private WebElementFacade tombolContinue;

    public void klikCountinue(){tombolContinue.click();}

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/aside/div[2]/div[2]/div[1]/div[8]/div[1]/h2/a")
    private WebElementFacade labelListCourseBigdata;

    public WebElementFacade tidakAdaBigData(){return labelListCourseBigdata;}



//////////////////////////////////////////////////////////////////////////


    public void klikboxsearch() {
        textboxSearch.click();
    }

    public void ketikKeywordSearch(String keyword) {
        textboxSearch.type(keyword);
    }

    public void cariCourse() {
        tombolCari.click();
    }

    public WebElement temukanKeyword(){
        WebElement element = getDriver().findElement(By.tagName("Big Data"));
        return element;
    }

//////////////////LIHAT PROFIL//////////////////////////////////////////////////////


    @FindBy(className = "description")
    private WebElementFacade deskripsiProfil;

    public void klikTombolProfil() {tombolProfil.click();}

    public WebElementFacade lihatProfil() {return deskripsiProfil;}

    public void klikTombolGrade() {tombolGrade.click();}

    public void lihatGrade() {

    }

    public void klikTombolMessages() {tombolMessages.click();}

    public WebElementFacade lihatMessages() { return isiMessages;}

    //////////////////////////////////LIHAT SEMUA MATAKULIAH/////////////////////

    public void klikTombolMatakuliah() {tombolMatakuliah.click();}

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[1]/div[2]/div/div[1]/div[1]/h3/a")
    private WebElementFacade tombolMOOC;

    public void klikTombolMOOC(){tombolMOOC.click();}


    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/div/div/div[2]/div[1]/div[1]/a")
//  @FindBy(xpath = "//*[@id=\"region-main\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/a")
    private WebElementFacade sampleMakulJarkom;

    public WebElementFacade lihatSemuaMatakuliah() { return sampleMakulJarkom;}


    //////////////////////////////////////////////////////////////////////////////////

    public void akanLihatHasilPencarian(){}

    public boolean labelCheck(){
        //setWaitForTimeout(5000);
        //waitFor(ExpectedConditions.presenceOfElementLocated(By.className(this.label)));
        return labelNama.isDisplayed();
    }

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/aside/div[2]/div[2]/div/div[1]/div[1]/h2/a")
    private WebElementFacade labelMakulSedangDiambil;

    public WebElementFacade lihatMakulSedangDiambil(){return labelMakulSedangDiambil;}

    ////////////////////////////////MEMBUAT COURSE////////////////////////////////////
    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
    private  WebElementFacade tblAddNewCourse;

    public void klikTombolAddNewCourse() {tblAddNewCourse.click();}

    @FindBy(xpath = "//input[@id='id_fullname']")
    private WebElementFacade boxCourseFullName;

    public void klikboxCourseFullName() {boxCourseFullName.click();}

    public void isiNamaCourse(String coursefullname) {boxCourseFullName.type(coursefullname);}

    @FindBy(xpath = "//input[@id='id_shortname']")
    private WebElementFacade boxCourseShortName;

    public void klikboxCourseShortName() {boxCourseShortName.click();}

    public void isiCourseshortname(String courseshortname) {boxCourseShortName.type(courseshortname);}


//    @FindBy(xpath = "//select[@id='id_category']")
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/section[1]/div[1]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/select[1]/option[2]")
    private WebElementFacade boxCourseCategory;

    public void klikCourseCategory(){boxCourseCategory.click();}

    @FindBy(xpath = "//input[@id='id_saveanddisplay']")
    private WebElementFacade tblSave;

    public void klikTombolSave() {tblSave.click();}

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/section[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[2]/span[1]")
    private WebElementFacade courseNameErrorMessage;

    public WebElementFacade temukanErorNamaCoursename(){return courseNameErrorMessage;}

    //////////////////////////////////////ADD NEW ASSIGNMENT////////////////////////////////////////////////

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElementFacade tblEnterCourse;

    public void klikEnterCourse(){tblEnterCourse.click();}

    @FindBy(xpath = "//p[@class='tree_item hasicon tree_item leaf']//a[contains(text(),'Hidupkan Mode Ubah')]")
    private WebElementFacade tblHidupkanModeEdit;

    public void klikTombolHidupkanModeEdit(){tblHidupkanModeEdit.click();}


    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/p[1]/a[1]")
    private WebElementFacade tblmakul;

    public void klikTblmakul(){
        String xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[2]/p[1]/a[1]";
        setWaitForElementTimeout(10000);
        waitFor(ExpectedConditions.presenceOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(xpath)));
        WebElementFacade makul = find(net.serenitybdd.core.annotations.findby.By.xpath(xpath));
        makul.click();

        }


    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[1]/div[3]/div[4]/div[1]/div[1]/span[1]/a[1]/span[1]")
    private WebElementFacade tblTambahanAktifitasTugas;

    //tblTambahanAktifitasTugas bisa
    //kalo imgnya ini /html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[1]/div[3]/div[4]/div[1]/div[1]/span[1]/a[1]/img[1]

    public void klikTambahkanAktifitasTugas(){
        String xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[1]/div[3]/div[4]/div[1]/div[1]/span[1]/a[1]/span[1]";
        setWaitForElementTimeout(10000);
        waitFor(ExpectedConditions.presenceOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(xpath)));
        WebElementFacade tambahtugas = find(net.serenitybdd.core.annotations.findby.By.xpath(xpath));
        tambahtugas.click();

        }



    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/label[1]/input[1]")
    private WebElementFacade tblAssignment;

    public void klikAssignment(){tblAssignment.click();}

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    private WebElementFacade tblTambah;

    public void klikTambah(){tblTambah.click();}

    @FindBy(xpath = "//input[@id='id_name']")
    private WebElementFacade boxAssignmentName;

    public void klikAssignmentName(){boxAssignmentName.click();}

    public void isiAssignmentName(String assignmentname){boxAssignmentName.type(assignmentname);}

    @FindBy(xpath = "//input[@id='id_submitbutton']")
    private WebElementFacade tblSimpandanTampilkan;

    public void klikSimpandanTampilkan(){tblSimpandanTampilkan.click();}

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/span[1]/a[1]/span[1]")
    private WebElementFacade tblMakul;

    public void klikMakul(){tblMakul.click();}

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/span[1]")
    private WebElementFacade listAssignment;

    public WebElementFacade akanLihatListTugas(){return listAssignment;}


    ////////////////////////////////////////////ADD NEW MATERI///////////////////////////////////////////////

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[2]/div[3]/div[2]/div[1]/div[1]/span[1]/a[1]/img[1]")
    private WebElementFacade tblTambahanAktifitas;

    public void klikTambahkanAktifitas(){
        String xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[2]/div[3]/div[2]/div[1]/div[1]/span[1]/a[1]/img[1]";
        setWaitForElementTimeout(10000);
        waitFor(ExpectedConditions.presenceOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(xpath)));
        WebElementFacade tambahkantugas = find(net.serenitybdd.core.annotations.findby.By.xpath(xpath));
        tambahkantugas.click();
        }



    @FindBy(xpath = "//input[@id='item_resource']")
    private WebElementFacade tblFile;

    public void klikFile(){tblFile.click();}

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/section[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/input[1]")
    private WebElementFacade textboxNama;

    public void klikNama(){textboxNama.click();}

    public void isiNama(String isinama){textboxNama.type(isinama);}

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/section[1]/div[1]/form[1]/fieldset[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
    private WebElementFacade tblAdd;

    public void klikAdd(){tblAdd.click();}

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
    private WebElementFacade tombolUploadAFile;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElementFacade tombolBrowse;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElementFacade tombolUploadThisFile;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/section[1]/div[1]/form[1]/fieldset[7]/div[1]/div[1]/div[1]/input[2]")
    private WebElementFacade tombolSaveChanges;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[2]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/span[1]")
    private WebElementFacade fieldFileStatus;

    public void klikUploadAFile(){tombolUploadAFile.click();}

    public void klikBrowse(){tombolBrowse.sendKeys("D:\\PengantarSoftwareQualityAssurance.pdf");}

    public void klikUploadThisFile(){tombolUploadThisFile.click();}


    public void klikSaveChanges(){tombolSaveChanges.click();}

    public WebElementFacade akanLihatSubmissionStatus(){return fieldFileStatus;}

    //////////////////////////////////////////////ADD FORUM///////////////////////////
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[3]/div[3]/div[2]/div[1]/div[1]/span[1]/a[1]/span[1]")
    private WebElementFacade tblTambahAktifitas;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[9]/label[1]/input[1]")
    private WebElementFacade tblForum;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/section[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/input[1]")
    private WebElementFacade boxForumName;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[3]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/span[1]")
    private WebElementFacade fieldForum;

    public void klikTambahAktifitas() {
        String xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[3]/div[3]/div[2]/div[1]/div[1]/span[1]/a[1]/span[1]";
        setWaitForElementTimeout(10000);
        waitFor(ExpectedConditions.presenceOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(xpath)));
        WebElementFacade tambahaktifitas = find(net.serenitybdd.core.annotations.findby.By.xpath(xpath));
        tambahaktifitas.click();

        }

    public void klikTombolForum() {tblForum.click();}

    public void klikForumName() {boxForumName.click();}

    public void isiForumName(String forumname) {boxForumName.type(forumname);}

    public WebElementFacade akanLihatHasilForum() {return fieldForum;}

    /////////////////////////////////////////////////MENAMBAH DESKRIPSI//////////////////////

    @FindBy(xpath = "//a[@id='action-menu-toggle-9']//b[@class='caret']")
    private WebElementFacade tblUbah;

    public void klikEdit(){tblUbah.click();}

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[1]/ul[2]/li[1]/a[1]/span[1]")
    private WebElementFacade tblEditSection;

    public void klikEditSection(){tblEditSection.click();}

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/section[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")
    private WebElementFacade textboxDescription;

    public void klikDescription(){textboxDescription.click();}

    public void mengisiDescription(String desc){textboxDescription.type(desc);}

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[1]/div[3]/div[1]/div[1]")
    private WebElementFacade textboxDesc;

    public WebElementFacade akanMelihatDeskripsiPembelajaran() {return textboxDesc ;}

    ///////////////////////////////////////////LOGIN AS DOSEN/////////////////////////////


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/ul[2]/li[9]/a[1]/img[1]")
    private WebElementFacade tblSwitchRole;

    public void klikSwitchRole(){tblSwitchRole.click();}

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/h2[1]")
    private WebElementFacade menuSwitchRole;

    public WebElementFacade akanLihatJudulMenuSitchRole(){return menuSwitchRole;}

}
//
//    public List<String> temukanHasilSearch(){
//        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Big Data')]"));
//        Assert.assertTrue("Text not found!", list.size() > 0);
//        return ;
//    }
//}
