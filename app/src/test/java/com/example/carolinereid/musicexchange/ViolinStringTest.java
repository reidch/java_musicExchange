package com.example.carolinereid.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 27/10/2017.
 */

public class ViolinStringTest {

    ViolinString violinString;

    @Before
    public void before() {
        violinString = new ViolinString(34, 45, "D'Addario", "medium");
    }

    @Test
    public void hasBrand() {
        assertEquals("D'Addario", violinString.getBrand());
    }

    @Test
    public void hasTension() {
        assertEquals("medium", violinString.getTension());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(34, violinString.getCostPrice(), 0.1);
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(45, violinString.getRetailPrice(), 0.1);
    }
}
