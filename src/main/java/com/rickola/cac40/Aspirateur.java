package com.rickola.cac40;

import java.io.IOException;
import java.util.Arrays;

public class Aspirateur {

    public static void saveToFile(String code) {
        try {
            String url = String.format(PropertiesUtils.getDay1(), code);
            String fileName = PropertiesUtils.getDirectoryDestination() + code + ".json";
            Cac40Util.saveUrlToFile(url, fileName);
            // double delay = Math.random() * 10000;
            System.out.println(code + "\t" + url);
            Thread.sleep(7000);
        } catch (Exception e) {
            throw new RuntimeException("Error on " + code + " " + e.getMessage());
        }
    }

    public static String readValues(String code) {
        try {
            String url = String.format(PropertiesUtils.getDay1(), code);
            String fileName = PropertiesUtils.getDirectoryDestination() + code + ".json";
            Thread.sleep(7000);
            return Cac40Util.readStringFromURL(url);
        } catch (Exception e) {
            throw new RuntimeException("Error on " + code + " " + e.getMessage());
        }
    }
}
