package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class DoubleBassRosin implements Sellable {
    private String brand;
    private int costPrice;
    private int retailPrice;

    public DoubleBassRosin(String brand, int costPrice, int retailPrice) {
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

    public int getRetailPrice() {
        return this.retailPrice;
    }
}
