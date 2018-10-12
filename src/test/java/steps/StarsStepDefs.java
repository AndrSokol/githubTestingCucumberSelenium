package steps;

import cucumber.api.java.en.Then;
import pages.StarsPage;

import static org.assertj.core.api.Assertions.assertThat;


public class StarsStepDefs {
    StarsPage starsPage = new StarsPage();

    @Then("^I see text \"([^\"]*)\" on stars page$")
    public void i_see_text_on_stars_page(String message) throws Throwable {
        String actual = starsPage.getMessage();
        assertThat(actual).isEqualTo(message);
    }

}
