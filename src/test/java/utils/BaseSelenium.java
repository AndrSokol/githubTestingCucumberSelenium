package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseSelenium {

    public static WebDriver driver;

    public static void initDriver(){
        String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");

        driver = getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void close(){
        try{
            driver.quit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            driver = null;
        }
    }

    private static WebDriver getDriver(String browser){
        WebDriver driver = null;

        switch (browser){
            case "firefox" :
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome" :
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "headlesschrome" :
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("headless");
                driver = new ChromeDriver(chromeOptions);
                break;
        }

        return driver;
    }
}
