package com.dimaTestJunit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dmytro_Stashok on 1/13/2017.
 */
@DefaultUrl("https://google.com.ua")
public class GoogleStartPage extends PageObject{

    @FindBy(id="lst-ib")
    WebElement searchField;

    @FindBy(id = "_fZl")
    WebElement searchButton;

    public void fillSearchField(String text){
        searchField.sendKeys(text);
    }

    public void searchButtonClick(){
        searchButton.click();
    }

    public void performSearch(String text) {
        fillSearchField(text);
        searchButtonClick();
    }
}
