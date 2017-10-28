package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Playable;
import com.example.carolinereid.musicexchange.Behaviours.Sellable;

import static android.R.attr.value;

/**
 * Created by carolinereid on 27/10/2017.
 */

public abstract class Instrument implements Playable, Sellable {

    private String material;
    private String colour;
    private String type;
    private double costPrice;
    protected double retailPrice;

    public Instrument(String material, String colour, String type, double costPrice, double retailPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getMaterial() { return this.material; }

    public String getColour() {
        return this.colour;
    }

    public String getType() {
        return this.type;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

    public double calculateMarkUp() {
        return this.retailPrice -= this.costPrice;
    }

    public void discountRetailPrice(double percentageDiscount) {
        this.retailPrice *= percentageDiscount;
    }

    public void increaseRetailPrice(int increase) {
        this.retailPrice += increase;
    }
}
