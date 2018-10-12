package pages;

import com.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private String username = PropertiesReader.appProps.getProperty("user.username");
    private String password = PropertiesReader.appProps.getProperty("user.password");

    public LoginPage open() {
        driver.get(url + "/login");
        return this;
    }

    public LoginPage setUsername() {
        System.out.println(username);
        $("//input[@id='login_field']").sendKeys(username);
        return this;
    }

    public LoginPage setPassword() {
        $("//input[@id='password']").sendKeys(password);
        return this;
    }

    public void clickSignInButton() {
        $("//input[@type='submit']").click();
    }

    public void login() {
        setUsername()
                .setPassword()
                .clickSignInButton();
    }
}
