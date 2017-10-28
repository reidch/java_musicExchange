package com.example.carolinereid.musicexchange.Instruments;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class Violin extends Instrument {
    private int numStrings;

    public Violin(String material, String colour, String type, double costPrice, double retailPrice, int numStrings) {
        super(material, colour, type, costPrice, retailPrice);
        this.numStrings = numStrings;
    }

    public int getNumStrings() { return this.numStrings; }

    @Override
    public String makeSound() { return "bright ribbons of sound"; }
}
