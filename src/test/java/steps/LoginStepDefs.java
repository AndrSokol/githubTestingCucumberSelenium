package steps;

import cucumber.api.java.en.Given;
import pages.LoginPage;
import pages.MainPage;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    @Given("^I open login page and sign in$")
    public void i_open_login_page_and_sign_in() throws Throwable {
        loginPage.open()
                .login();
    }

    @Given("^I login to site$")
    public void i_login_to_site() throws Throwable {
        loginPage = mainPage.clickSignIn();
        loginPage.login();
    }
}
