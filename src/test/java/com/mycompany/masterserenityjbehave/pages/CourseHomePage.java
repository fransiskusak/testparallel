package com.mycompany.masterserenityjbehave.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Fransiskus A K on 08/02/2018.
 */
public class CourseHomePage extends PageObject {

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[2]/form/fieldset[2]/div/div/div/input")
    private WebElementFacade tblEnroll;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/aside/div[2]/div[2]/div/ul/li/ul/li/p/a")
    private WebElementFacade tblUnenroll;


    public void enroll(){tblEnroll.click();}

    public void temukanUnenroll(){}

}
