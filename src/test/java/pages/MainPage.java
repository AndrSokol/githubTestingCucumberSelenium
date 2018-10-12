package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{
    public void open() {
        System.out.println("Open site");
        driver.get(url);
    }

    public LoginPage clickSignIn() {
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']")));
        System.out.println("Before login");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $("//*[.='Sign in']").click();
//        $("//a[@href='/login']").click();
        System.out.println("After login");
        return new LoginPage();
    }
}
