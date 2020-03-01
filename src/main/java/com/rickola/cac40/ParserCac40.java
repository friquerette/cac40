package com.rickola.cac40;

import com.google.gson.Gson;
import com.rickola.cac40.bean.Stock;

import java.io.FileReader;

public class ParserCac40 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //JSON parser object to parse read file
        try (FileReader reader = new FileReader("C://Users//Rick//Dropbox//Java//CAC40//pai/1rPAI_30.json")) {
            //Read JSON file
            Gson gson = new Gson();
            Stock c = gson.fromJson(reader, Stock.class);
            System.out.println("");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}