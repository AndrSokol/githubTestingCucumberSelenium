package steps;

import com.PropertiesReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.BaseSelenium;

public class MainHooks {

    @Before
    public static void init(){
        BaseSelenium.initDriver();
        PropertiesReader.loadProperties();
    }

    @After
    public static void closeSelenium(){
        BaseSelenium.close();
    }


}
