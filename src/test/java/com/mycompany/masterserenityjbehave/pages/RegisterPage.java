package com.mycompany.masterserenityjbehave.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Fransiskus A K on 20/02/2018.
 */
public class RegisterPage extends PageObject {
    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[1]/div/div[1]/div[2]/input")
    private WebElementFacade boxUsername;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[1]/div/div[3]/div[2]/div/a[1]/span/span/em")
    private WebElementFacade boxPassword;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[1]/div[2]/input")
    private WebElementFacade boxEmail;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[2]/div[2]/input")
    private WebElementFacade boxEmailAgain;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[3]/div[2]/input")
    private WebElementFacade boxFirstName ;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[4]/div[2]/input")
    private WebElementFacade boxSurname ;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[5]/div[2]/input")
    private WebElementFacade boxCityTowne ;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[2]/div/div[6]/div[2]/select")
    private WebElementFacade dropdownCountry ;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[3]/div/div[1]/div/input[1]")
    private WebElementFacade tombolCreate ;

    @FindBy(xpath = "html/body/div[3]/div[2]/div/section/div/form/fieldset[3]/div/div[1]/div/input[2]")
    private WebElementFacade boxCancel ;

//    @FindBy(xpath = "")
//    private WebElementFacade boxSurname ;
//
//    @FindBy(xpath = "")
//    private WebElementFacade boxSurname ;


}
