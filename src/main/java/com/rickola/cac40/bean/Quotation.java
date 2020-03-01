package com.rickola.cac40.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Quotation {
    @SerializedName("Name")
    private String name;
    @SerializedName("SymbolId")
    private String symbolId;
    @SerializedName("Xperiod")
    private float xPeriod;
    @SerializedName("QuoteTab")
    ArrayList<QuoteTab> quoteTab = new ArrayList<>();


    // Getter Methods
    public String getName() {
        return name;
    }

    public String getSymbolId() {
        return symbolId;
    }

    public float getxPeriod() {
        return xPeriod;
    }

    // Setter Methods

    public void setName(String Name) {
        this.name = Name;
    }

    public void setSymbolId(String SymbolId) {
        this.symbolId = SymbolId;
    }

    public void setxPeriod(float Xperiod) {
        this.xPeriod = Xperiod;
    }
}
