package me.belial.evehell;

import com.google.gson.annotations.Expose;

public class Appraisal {
    @Expose
    public Totals totals;

    @Override
    public String toString() {
        return "Appraisal{" +
                "totals=" + totals +
                '}';
    }
}
