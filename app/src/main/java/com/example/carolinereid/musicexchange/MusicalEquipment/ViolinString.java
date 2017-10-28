package com.example.carolinereid.musicexchange.MusicalEquipment;

/**
 * Created by carolinereid on 28/10/2017.
 */

public class ViolinString extends Equipment {
    private String brand;
    private String tension;
    public ViolinString(double costPrice, double retailPrice, String brand, String tension) {
        super(costPrice, retailPrice);
        this.brand = brand;
        this.tension = tension;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getTension() {
        return this.tension;
    }
}
