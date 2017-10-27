package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class FluteMopTest {

    FluteMop fluteMop;

    @Before
    public void before() {
        fluteMop = new FluteMop("microfibre", 4, 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals("microfibre", fluteMop.getMaterial());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(4, fluteMop.getCostPrice());
    }

    @Test
    public void hasRetailPrice() { assertEquals(6, fluteMop.getRetailPrice()); }
}
