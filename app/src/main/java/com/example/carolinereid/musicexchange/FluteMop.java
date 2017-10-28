package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class FluteMop implements Sellable {
    private String material;
    private int costPrice;
    private double retailPrice;

    public FluteMop(String material, int costPrice, double retailPrice) {
        this.material = material;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getMaterial() {
        return this.material;
    }

    public int getCostPrice() {
        return this.costPrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }
}
