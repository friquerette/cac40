package com.rickola.cac40;

import com.google.gson.Gson;
import com.rickola.cac40.bean.QuoteTab;
import com.rickola.cac40.bean.Stock;

import java.io.FileReader;
import java.time.LocalDate;

public class ParserCac40 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        parseFromFile();
    }

    public static void parseFromFile() {
        //JSON parser object to parse read file
        try (FileReader reader = new FileReader(PropertiesUtils.getDirectoryDestination()  + "1rPAI_1.json")) {
            Gson gson = new Gson();
            printValue(gson.fromJson(reader, Stock.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void parseFromString(String data) {
        //JSON parser object to parse read file
        Gson gson = new Gson();
        printValue(gson.fromJson(data, Stock.class));
    }

    public static void printValue(Stock stock) {
        long count = stock.getQuotation().getQuoteTab().stream().count();
        QuoteTab quoteTab = stock.getQuotation().getQuoteTab().stream().skip(count - 1).findFirst().get();
        quoteTab.getDate();
        System.out.println(stock.getQuotation().getName() + "=" + quoteTab.toString());
    }
}