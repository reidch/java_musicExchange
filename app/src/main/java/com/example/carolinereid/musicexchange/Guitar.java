package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Playable;
import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class Guitar extends Instrument {
    private int numStrings;

    public Guitar(String material, String colour, String type, int costPrice, int retailPrice, int numStrings) {
        super(material, colour, type, costPrice, retailPrice);
        this.numStrings = numStrings;
    }

    public int getNumStrings() { return this.numStrings; }

    @Override
    public String makeSound() {
        return "strum, strum";
    }
}