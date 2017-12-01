package com.mycompany.masterserenityjbehave.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://www.elok.ugm.ac.id/")
public class HomePage extends PageObject {

    @org.openqa.selenium.support.FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/form/div[1]/input[1]")
    private WebElementFacade boxUsername;

    @org.openqa.selenium.support.FindBy(xpath ="html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/form/div[1]/input[2]" )
    private WebElementFacade boxPassword;

    @FindBy( id = "yui_3_17_2_1_1512032464258_228")
    private WebElementFacade textNamauser;



    @FindBy(xpath = "html/body/div[1]/div[2]/header[1]/div/div/div[2]/div/form/div[1]/input[3]")
    private WebElementFacade tombolLogin;

    public void klikUsername() {boxUsername.click();}
    public void ketikUsername(String username) {boxUsername.type(username);}
    public void klikPassword() {boxPassword.click();}
    public void ketikPassword(String password) {
        boxPassword.type(password);
    }

    public void klikLogin() {tombolLogin.click();}

    public WebElementFacade lihatNama() {
        return textNamauser;
    }

}