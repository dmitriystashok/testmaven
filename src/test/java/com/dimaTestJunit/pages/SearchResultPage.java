package com.dimaTestJunit.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dmytro_Stashok on 1/13/2017.
 */
public class SearchResultPage extends PageObject{

@FindBy(xpath = "//*[@id='rso']//a[contains(text(),\"automated-testing.info\")]")
    WebElement searchResult;

    public WebElement searchResult(){
        return searchResult;
    }

}
