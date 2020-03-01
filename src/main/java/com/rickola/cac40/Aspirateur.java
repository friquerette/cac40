package com.rickola.cac40;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class Aspirateur {

    public static void main(String[] args) throws IOException {
        //Arrays.asList(Cac40Enum.AI, Cac40Enum.DG, Cac40Enum.PSP5).stream().map(Cac40Enum::getCode).forEach(Aspirateur::extract);
        System.out.println("user.dir: "+getPropertiesFile().get("directoryDestination"));
        ;
    }

    private static Properties getPropertiesFile() {
        Properties prop = new Properties();
        try (InputStream input = new Aspirateur().getClass().getClassLoader().getResourceAsStream("application.properties")) {
            prop.load(input);
            prop.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }


    private static void extract(String code) {
        try {
            String url = String.format(Cac40Util.urlTemplate, code);
            String fileName = Cac40Util.directoryDestination + "\\" + code + ".json";
            String out = Cac40Util.readStringFromURLShort("http://monip.org");

            Cac40Util.saveUrlToFile(url, fileName);
            // double delay = Math.random() * 10000;
            System.out.println(code + "\t" + url);
            Thread.sleep(10);
        } catch (Exception e) {
            throw new RuntimeException("Error on " + code + " " + e.getMessage());
        }
    }
}
