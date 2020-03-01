package com.rickola.cac40;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
    private static Properties prop = null;
    public static Properties getPropertiesFile() {
        if(prop == null) {
            prop = new Properties();
            try (InputStream input = new PropertiesUtils().getClass().getClassLoader().getResourceAsStream("application.properties")) {
                prop.load(input);
                prop.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return prop;
    }

    public static String getDirectoryDestination() {
        return getPropertiesFile().getProperty("directoryDestination");
    }

    public static String getDirectoryTest() {
        return getPropertiesFile().getProperty("directoryTest");
    }

    public static String getMonth1() {
        return getPropertiesFile().getProperty("month1");
    }

    public static String getYear10() {
        return getPropertiesFile().getProperty("year10");
    }
}
