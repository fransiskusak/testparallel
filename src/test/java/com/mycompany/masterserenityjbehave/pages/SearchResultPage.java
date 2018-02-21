package com.mycompany.masterserenityjbehave.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

/**
 * Created by Fransiskus A K on 08/02/2018.
 */
public class SearchResultPage extends PageObject {

    //@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[1]/div/div[2]/div[1]/h3/a/span[3]")
    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/section/div/div[1]/div/div[2]/div[1]/h3/a")
    private WebElementFacade tulisanBigDt;

    public void klikTulisanBigData() {tulisanBigDt.click();}

}
