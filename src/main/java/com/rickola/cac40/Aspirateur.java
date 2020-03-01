package com.rickola.cac40;

import java.io.IOException;

public class Aspirateur {

    public static void main(String[] args) throws IOException {
        // Arrays.asList(Cac40Enum.AI, Cac40Enum.DG, Cac40Enum.PSP5).stream().map(Cac40Enum::getCode).forEach(Aspirateur::extract);
        System.out.println("user.dir: "+ PropertiesUtils.getDirectoryDestination());
        ;
    }


    private static void extract(String code) {
        try {
            String url = String.format(Cac40Util.urlTemplate, code);
            String fileName = Cac40Util.directoryDestination + "\\" + code + ".json";
            String out = Cac40Util.readStringFromURL("http://monip.org");

            Cac40Util.saveUrlToFile(url, fileName);
            // double delay = Math.random() * 10000;
            System.out.println(code + "\t" + url);
            Thread.sleep(7);
        } catch (Exception e) {
            throw new RuntimeException("Error on " + code + " " + e.getMessage());
        }
    }
}
