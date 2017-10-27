package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class GuitarStrapTest {

    GuitarStrap guitarStrap;

    @Before
    public void before() {
        guitarStrap = new GuitarStrap("Planet Waves", 14, 22);
    }

    @Test
    public void hasBrand() {
        assertEquals("Planet Waves", guitarStrap.getBrand());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(14, guitarStrap.getCostPrice());
    }

    @Test
    public void hasRetailPrice() { assertEquals(22, guitarStrap.getRetailPrice()); }
}
