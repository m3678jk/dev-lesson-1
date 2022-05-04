package goitpackage;

import lombok.Data;

@Data
public class Item {
    private float price;
    private int happyQty;
    private float happyPrice;

    public Item(float price) {
        this.price = price;
    }

    public Item(float price, int happyQty, float happyPrice) {
        this.price = price;
        this.happyQty = happyQty;
        this.happyPrice = happyPrice;
    }
}
