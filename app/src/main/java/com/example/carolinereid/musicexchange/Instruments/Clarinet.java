package com.example.carolinereid.musicexchange.Instruments;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class Clarinet extends Instrument {
    private String mouthpiece;

    public Clarinet(String material, String colour, String type, double costPrice, double retailPrice, String mouthpiece) {
        super(material, colour, type, costPrice, retailPrice);
        this.mouthpiece = mouthpiece;
    }

    public String getMouthpiece() { return this.mouthpiece; }

    @Override
    public String makeSound() {
        return "woody resonance";
    }
}
