package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class ClarinetReed implements Sellable {
    private int packSize;
    private String brand;
    private int costPrice;
    private int retailPrice;

    public ClarinetReed(int packSize, String brand, int costPrice, int retailPrice) {
        this.packSize = packSize;
        this.brand = brand;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public int getPackSize() {
        return this.packSize;
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
