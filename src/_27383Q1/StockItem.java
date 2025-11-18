package _27383Q1;

import _27383.Q3Tax.Entity;

public class StockItem extends Entity {
    private String name;
    private double price;

    public StockItem(int id, java.time.LocalDate created, java.time.LocalDate updated, String name, double price) {
        super(id, created, updated);
        this.name = name;
        this.price = price;
    }
}
