package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class DoubleBassTest {

    DoubleBass doubleBass;

    @Before
    public void before() {
        doubleBass = new DoubleBass("wood", "warm brown", "string", 900, 1150, 4);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", doubleBass.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("warm brown", doubleBass.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("string", doubleBass.getType());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(900, doubleBass.getCostPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(1150, doubleBass.getRetailPrice(), 0.1);
    }

    @Test
    public void canMakeSound() {
        assertEquals("mellow and deep", doubleBass.makeSound());
    }
}
