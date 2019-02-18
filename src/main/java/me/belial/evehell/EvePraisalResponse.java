package me.belial.evehell;

import com.google.gson.annotations.Expose;

public class EvePraisalResponse {
    @Expose
    public Appraisal appraisal;


    @Override
    public String toString() {
        return "EvePraisalResponse{" +
                "appraisal=" + appraisal +
                '}';
    }
}
