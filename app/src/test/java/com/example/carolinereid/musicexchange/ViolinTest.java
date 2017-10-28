package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("wood", "rich brown", "string", 450, 600, 4);
    }

    @Test
    public void hasMaterial() { assertEquals("wood", violin.getMaterial()); }

    @Test
    public void hasColour() { assertEquals("rich brown", violin.getColour()); }

    @Test
    public void hasType() { assertEquals("string", violin.getType()); }

    @Test
    public void hasCostPrice() { assertEquals(450, violin.getCostPrice(), 0.1); }

    @Test
    public void hasRetailPrice() { assertEquals(600, violin.getRetailPrice(), 0.1); }

    @Test
    public void hasNumStrings() { assertEquals(4, violin.getNumStrings()); }

    @Test
    public void canMakeSound() {
        assertEquals("bright ribbons of sound", violin.makeSound());
    }

}
