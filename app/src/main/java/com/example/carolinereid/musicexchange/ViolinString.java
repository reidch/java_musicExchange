package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class ViolinString implements Sellable {
    private String brand;
    private String tension;
    private int costPrice;
    private int retailPrice;

    public ViolinString(String brand, String tension, int costPrice, int retailPrice) {
        this.brand = brand;
        this.tension = tension;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getTension() {
        return this.tension;
    }

    public int getCostPrice() {
        return this.costPrice;
    }

    public int getRetailPrice() {
        return this.retailPrice;
    }
}
