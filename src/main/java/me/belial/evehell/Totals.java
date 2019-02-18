package me.belial.evehell;

import com.google.gson.annotations.Expose;

public class Totals {
    @Expose
    public Double buy;
    @Expose
    public Double sell;
    @Expose
    public Double volume;


    @Override
    public String toString() {
        return "Totals{" +
                "buy=" + buy +
                ", sell=" + sell +
                ", volume=" + volume +
                '}';
    }
}
