package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.MainLoggedPage;
import pages.MainPage;
import pages.PageWidget;

public class MainStepDefs {

    MainPage mainPage = new MainPage();
    PageWidget pageWidget = new PageWidget();
    MainLoggedPage mainLoggedPage = new MainLoggedPage();

    @Given("^I open site$")
    public void i_open_site() throws Throwable {
        mainPage.open();
    }

    @When("^I open menu item \"([^\"]*)\"$")
    public void i_open_menu_item(String option) throws Throwable {
        pageWidget.open()
                .clickItem(option);
    }

    @Given("^I open project \"([^\"]*)\"$")
    public void i_open_project(String projectName) throws Throwable {
        mainLoggedPage.openProject(projectName);
    }
}
