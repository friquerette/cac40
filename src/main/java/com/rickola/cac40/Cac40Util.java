package com.rickola.cac40;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Cac40Util {
    public static String directoryDestination = PropertiesUtils.getDirectoryTest();
    public static String urlTemplate = PropertiesUtils.getMonth1();
    public static String UTF8 = StandardCharsets.UTF_8.toString();

    public static void saveUrlToFile(String url, String fileName) throws IOException {
        Files.copy(new URL(url).openStream(), Paths.get(fileName));
    }

    public static String readStringFromURLShort(String url) throws IOException {
        return new Scanner(new URL(url).openStream(), UTF8).useDelimiter("\\A").next();
    }

    public static String readStringFromURL(String url) throws IOException {
        try (Scanner scanner = new Scanner(new URL(url).openStream(), UTF8)) {
            scanner.useDelimiter("\\A");
            return scanner.hasNext() ? scanner.next() : "";
        }
    }
}
