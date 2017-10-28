package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.MusicalEquipment.DoubleBassRosin;

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
        doubleBassRosin = new DoubleBassRosin(7, 10, "Nyman");
    }

    @Test
    public void hasBrand() {
        assertEquals("Nyman", doubleBassRosin.getBrand());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(7, doubleBassRosin.getCostPrice(), 0.1);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(10, doubleBassRosin.getRetailPrice(), 0.1);
    }
}
