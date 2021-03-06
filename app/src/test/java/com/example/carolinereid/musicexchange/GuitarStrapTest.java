package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.MusicalEquipment.GuitarStrap;

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
        guitarStrap = new GuitarStrap( 14, 22, "Planet Waves");
    }

    @Test
    public void hasBrand() {
        assertEquals("Planet Waves", guitarStrap.getBrand());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(14, guitarStrap.getCostPrice(), 0.1);
    }

    @Test
    public void hasRetailPrice() { assertEquals(22, guitarStrap.getRetailPrice(), 0.1); }
}
