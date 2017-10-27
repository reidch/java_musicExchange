package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class DoubleBassRosinTest {

    DoubleBassRosin doubleBassRosin;

    @Before
    public void before() {
        doubleBassRosin = new DoubleBassRosin("Nyman", 7, 10);
    }

    @Test
    public void hasBrand() {
        assertEquals("Nyman", doubleBassRosin.getBrand());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(7, doubleBassRosin.getCostPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(10, doubleBassRosin.getRetailPrice());
    }
}
