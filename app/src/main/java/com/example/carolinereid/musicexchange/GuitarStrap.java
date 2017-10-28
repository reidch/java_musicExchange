package com.example.carolinereid.musicexchange;

/**
 * Created by carolinereid on 28/10/2017.
 */

public class GuitarStrap extends Equipment {
    private String brand;

    public GuitarStrap(double costPrice, double retailPrice, String brand) {
        super(costPrice, retailPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }
}
