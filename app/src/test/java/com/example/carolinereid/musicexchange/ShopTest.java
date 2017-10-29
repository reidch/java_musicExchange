package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Instruments.Instrument;
import com.example.carolinereid.musicexchange.Instruments.Violin;
import com.example.carolinereid.musicexchange.MusicalEquipment.Equipment;
import com.example.carolinereid.musicexchange.MusicalEquipment.FluteMop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 29/10/2017.
 */

public class ShopTest {
    Shop shop;
    Violin violin;
    FluteMop fluteMop;

    @Before
    public void before () {
        shop = new Shop("Steve's Music Exchange");
        violin = new Violin("wood", "rich brown", "string", 450, 600, 4);
        fluteMop = new FluteMop(4, 6, "microfibre");
    }

    @Test
    public void testGetName() {
        assertEquals("Steve's Music Exchange", shop.getName());
    }

    @Test
    public void testStockCount() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStock() {
        shop.addStock(violin);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(violin);
        assertEquals(0, shop.stockCount());
    }
}
