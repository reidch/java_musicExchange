package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("metal", "silver", "woodwind", 350, 450, 16);
    }

    @Test
    public void hasMaterial() {
        assertEquals("metal", flute.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("silver", flute.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("woodwind", flute.getType());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(350, flute.getCostPrice(), 0.1);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(450, flute.getRetailPrice(), 0.1);
    }

    @Test
    public void hasToneHoles() { assertEquals(16, flute.getToneHoles()); }

    @Test
    public void canMakeSound() {
        assertEquals("bright and breathy", flute.makeSound());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(100, flute.calculateMarkUp(), 0.1);
    }
}
