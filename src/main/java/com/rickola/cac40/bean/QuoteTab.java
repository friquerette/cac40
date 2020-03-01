package com.rickola.cac40.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class QuoteTab {

    @SerializedName("d")
    private String day;
    @SerializedName("o")
    private String open;
    @SerializedName("h")
    private String high;
    @SerializedName("l")
    private String low;
    @SerializedName("c")
    private String close;
    @SerializedName("v")
    private String volume;
    @Expose(serialize = false, deserialize = false)
    private String date;

    public String getDay() {
        if(date == null || "".equals(date)) {
            this.date = LocalDate.parse("1970-01-01").plusDays(Long.parseLong(day.substring(0, 5))).toString();
        }
        return day;
    }

    public void setDay(String day) {
        if(date == null || "".equals(date)) {
            this.date = LocalDate.parse("1970-01-01").plusDays(Long.parseLong(day.substring(0, 5))).toString();
        }
        this.day = day;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getDate() {
        if(date == null || "".equals(date)) {
            this.date = LocalDate.parse("1970-01-01").plusDays(Long.parseLong(day.substring(0, 5))).toString();
        }
        return date;
    }

    @Override
    public String toString() {
        return "QuoteTab{" +
                "date=" + date +
                ", day='" + day + '\'' +
                ", open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", close='" + close + '\'' +
                ", volume='" + volume + '\''  +
                '}';
    }
}
