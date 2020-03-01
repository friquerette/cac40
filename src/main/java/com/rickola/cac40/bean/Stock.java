package com.rickola.cac40.bean;

import com.google.gson.annotations.SerializedName;

public class Stock {

    @SerializedName("d")
    Quotation quotation;

    public Quotation getQuotation() {
        return quotation;
    }

    public void setQuotation(Quotation quotation) {
        this.quotation = quotation;
    }
}