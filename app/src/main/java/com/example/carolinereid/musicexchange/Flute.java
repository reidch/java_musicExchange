package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Playable;
import com.example.carolinereid.musicexchange.Behaviours.Sellable;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class Flute extends Instrument {
    private int toneHoles;

    public Flute(String material, String colour, String type, int costPrice, int retailPrice, int toneHoles) {
        super(material, colour, type, costPrice, retailPrice);
        this.toneHoles = toneHoles;
    }

    public int getToneHoles() { return this.toneHoles; }

    @Override
    public String makeSound() {
        return "bright and breathy";
    }
}
