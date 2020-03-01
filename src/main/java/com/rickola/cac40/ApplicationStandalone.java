package com.rickola.cac40;

import java.io.IOException;
import java.util.Arrays;

public class ApplicationStandalone {

    public static void main(String[] args) throws IOException {
        Arrays.asList(Cac40Enum.AI, Cac40Enum.DG, Cac40Enum.PSP5)
                //.stream().map(Cac40Enum::getCode).forEach(Aspirateur::saveToFile);
                .stream().map(Cac40Enum::getCode)
                .map(Aspirateur::readValues)
                .forEach(ParserCac40::parseFromString);
    }

}
