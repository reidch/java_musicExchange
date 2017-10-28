package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class ClarinetReedTest {

    ClarinetReed clarinetReed;

    @Before
    public void before() {
        clarinetReed = new ClarinetReed(5, 7, 3, "Vandoren");
    }

    @Test
    public void hasPackSize() {
        assertEquals(3, clarinetReed.getPackSize());
    }

    @Test
    public void hasBrand() {
        assertEquals("Vandoren", clarinetReed.getBrand());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(5, clarinetReed.getCostPrice(), 0.1);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(7, clarinetReed.getRetailPrice(), 0.1);
    }
}
