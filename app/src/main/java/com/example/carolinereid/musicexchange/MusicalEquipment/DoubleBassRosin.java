package com.example.carolinereid.musicexchange.MusicalEquipment;

/**
 * Created by carolinereid on 28/10/2017.
 */

public class DoubleBassRosin extends Equipment {
    private String brand;

    public DoubleBassRosin(double costPrice, double retailPrice, String brand) {
        super(costPrice, retailPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }
}
