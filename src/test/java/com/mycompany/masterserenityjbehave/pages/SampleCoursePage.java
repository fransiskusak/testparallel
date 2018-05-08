package com.mycompany.masterserenityjbehave.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Fransiskus A K on 01/05/2018.
 */

@DefaultUrl("https://elok.ugm.ac.id/course/view.php?id=12#section-0")
public class SampleCoursePage extends PageObject {
    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div/ul/li[1]/div[3]/ul/li[6]/div/div/div[2]/div/a/span")
    private WebElementFacade tombolTugasAwal;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/div[2]/div[1]/form/div/input[1]")
    private WebElementFacade tombolAddSubmission;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[1]/div/div/div[1]/label")
    private WebElementFacade menuFileSubmission;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/a")
    private WebElementFacade tombolAdd;

    @FindBy(xpath = "html/body/div[5]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/form/div/div[1]/div/input")
    private WebElementFacade tombolUploadAFile;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/section/div/form/fieldset[2]/div/div[1]/div/input[1]")
    private WebElementFacade tombolBrowse;

    @FindBy(xpath = "html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/button")
    private WebElementFacade tombolUploadThisFile;

    @FindBy(xpath = "html/body/div[6]/div[2]/div/div[2]/div/div[1]/ul/li[1]/a/span")
    private WebElementFacade tombolRecentFile;

    @FindBy(xpath = "html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/a[1]/div[1]/div[3]")
    private WebElementFacade fileTerselect;

    @FindBy(xpath = "html/body/div[7]/div[2]/div/div[2]/div/form/div[2]/button[1]")
    private WebElementFacade tombolSelectThisFile;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[2]/div/div/div/input[1]")
    private WebElementFacade tombolSaveChanges;


    public void klikTugasAwal(){tombolTugasAwal.click();}

    public void klikAddSubsmission(){tombolAddSubmission.click();}

    public void klikFileSubmission(){menuFileSubmission.click();}

    public void klikAdd(){tombolAdd.click();}

    public void klikUploadAFile(){tombolUploadAFile.click();}

    public void klikBrowse(){tombolBrowse.sendKeys("H:\\TugasAwal.docx");}

    public void klikUploadThisFile(){tombolUploadThisFile.click();}

    public void klikRecentFile(){tombolRecentFile.click();}

    public void klikFileTerselect(){fileTerselect.click();}

    public void klikSelectThisFile(){tombolSelectThisFile.click();}

    public void klikSaveChanges(){tombolSaveChanges.click();}
//    public WebElementFacade lihatMenuFileSubmission(){return menuFileSubmission;}

}