package com.example.carolinereid.musicexchange.MusicalEquipment;

/**
 * Created by carolinereid on 28/10/2017.
 */

public class ClarinetReed extends Equipment {
    private int packSize;
    private String brand;

    public ClarinetReed(double costPrice, double retailPrice, int packSize, String brand) {
        super(costPrice, retailPrice);
        this.packSize = packSize;
        this.brand = brand;
    }

    public int getPackSize() {
        return this.packSize;
    }

    public String getBrand() {
        return this.brand;
    }
}
