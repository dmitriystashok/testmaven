package com.dimaTestJunit.steps.serenity;

import com.dimaTestJunit.pages.DictionaryPage;
import com.dimaTestJunit.pages.GoogleStartPage;
import com.dimaTestJunit.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;
    GoogleStartPage googleStartPage;
    SearchResultPage searchResultPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
    @Step
    public void isOnStartPage() {
        googleStartPage.open();
    }
    @Step
    public void search() {
        googleStartPage.performSearch("automation testing");
    }
    @Step
    public void seeSearchResult() {
    assertThat("Text doesn't correspond to searching one",searchResultPage.searchResult().isDisplayed());
    }
}