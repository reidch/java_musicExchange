package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before() {
        clarinet = new Clarinet("wood", "ebony black", "woodwind", 650, 850, "ebonite");
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", clarinet.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("ebony black", clarinet.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("woodwind", clarinet.getType());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(650, clarinet.getCostPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(850, clarinet.getRetailPrice());
    }

    @Test
    public void hasMouthpiece() { assertEquals("ebonite", clarinet.getMouthpiece()); }

    @Test
    public void canMakeSound() {
        assertEquals("woody resonance", clarinet.makeSound());
    }
}
