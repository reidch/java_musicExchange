package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Playable;
import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class Clarinet extends Instrument {
    private String mouthpiece;

    public Clarinet(String material, String colour, String type, int costPrice, int retailPrice, String mouthpiece) {
        super(material, colour, type, costPrice, retailPrice);
        this.mouthpiece = mouthpiece;
    }

    public String getMouthpiece() { return this.mouthpiece; }

    @Override
    public String makeSound() {
        return "woody resonance";
    }

    public void reduceRetailPrice(int discount) {
        this.retailPrice -= discount;
    }
}
