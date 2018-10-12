package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.BaseSelenium;
import com.PropertiesReader;

import java.util.List;

public class BasePage extends BaseSelenium {
    Logger logger = LoggerFactory.getLogger(BasePage.class);

    protected String url = PropertiesReader.appProps.getProperty("site.url");

    protected WebElement $(String xpath, String... args) {
        return driver.findElement(By.xpath(String.format(xpath, args)));
    }

    protected List<WebElement> $$(By by) {
        return driver.findElements(by);
    }

    protected WebElement $(By by) {
        return driver.findElement(by);
    }

    public Boolean elementIsVisible(WebElement element){
        return element.isDisplayed();
    }
}
