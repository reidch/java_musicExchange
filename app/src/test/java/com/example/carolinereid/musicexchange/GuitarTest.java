package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("wood", "brown", "guitar", 170, 250, 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("guitar", guitar.getType());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(170, guitar.getCostPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(250, guitar.getRetailPrice(), 0.1);
    }

    @Test
    public void hasNumStrings() { assertEquals(6, guitar.getNumStrings()); }

    @Test
    public void canMakeSound() {
        assertEquals("strum, strum", guitar.makeSound());
    }
}
