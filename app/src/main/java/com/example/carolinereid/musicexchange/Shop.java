package com.example.carolinereid.musicexchange;

import com.example.carolinereid.musicexchange.Behaviours.Sellable;

import java.util.ArrayList;

/**
 * Created by carolinereid on 28/10/2017.
 */

public class Shop {
    private String name;
    private ArrayList<Sellable> stock;


    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<Sellable>();
    }

    public String getName() {
        return this.name;
    }

    public int stockCount() { return stock.size(); }

    public void addStock(Sellable item) {
        stock.add(item);
    }

    public void removeStock(Sellable item) {
        stock.remove(item);
    }
}
