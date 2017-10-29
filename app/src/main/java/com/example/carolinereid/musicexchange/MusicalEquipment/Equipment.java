package com.example.carolinereid.musicexchange.MusicalEquipment;

import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 28/10/2017.
 */

public abstract class Equipment implements Sellable {

    private double costPrice;
    private double retailPrice;

    public Equipment(double costPrice, double retailPrice) {
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

    public double calculateMarkUp() { return this.retailPrice -= this.costPrice; }

    public void discountRetailPrice(double percentageDiscount) { this.retailPrice *= percentageDiscount; }

    public void increaseRetailPrice(int increase) {
        this.retailPrice += increase;
    }
}