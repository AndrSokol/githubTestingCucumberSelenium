package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static Properties appProps;

    public static void loadProperties()  {

        String rootPath = Thread.currentThread().getContextClassLoader().getResource("properties").getPath();
        String propFileName = getPropertyFileName(System.getProperty("app_env"));
        String appConfigPath = rootPath + "/" + propFileName;

        appProps = new Properties();
        try {
            appProps.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getPropertyFileName(String env) {
        String propFileName = null;
        if (env == null) {
            propFileName = "qa.properties";
        } else {
            switch (env) {
                case "qa":
                    propFileName = "qa.properties";
                    break;
                case "local":
                    propFileName = "local.properties";
            }
        }
        return propFileName;
    }
}
