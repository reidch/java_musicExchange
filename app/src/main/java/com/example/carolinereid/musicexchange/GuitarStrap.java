package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class GuitarStrap implements Sellable {
    private String brand;
    private int costPrice;
    private double retailPrice;

    public GuitarStrap(String brand, int costPrice, double retailPrice) {
        this.brand = brand;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getCostPrice() {
        return this.costPrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }
}
