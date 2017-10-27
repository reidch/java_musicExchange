package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Playable;
import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 27/10/2017.
 */

public abstract class Instrument implements Playable, Sellable {

    private String material;
    private String colour;
    private String type;
    private int costPrice;
    protected int retailPrice;

    public Instrument(String material, String colour, String type, int costPrice, int retailPrice) {
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

    public int getCostPrice() {
        return this.costPrice;
    }

    public int getRetailPrice() {
        return this.retailPrice;
    }
}
