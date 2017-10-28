package com.example.carolinereid.musicexchange.MusicalEquipment;

/**
 * Created by carolinereid on 28/10/2017.
 */

public class FluteMop extends Equipment {
    private String material;

    public FluteMop(double costPrice, double retailPrice, String material) {
        super(costPrice, retailPrice);
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }
}
