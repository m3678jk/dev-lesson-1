package goitpackage;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Summarizer sum = new Summarizer(new ShopItems() {
            @Override
            public Map<String, Item> getItems() {
                Map <String,Item> items = new HashMap();
                items.put("A", new Item(1.25f,3,3.0f));
                items.put("B", new Item(4.25f));
                items.put("C", new Item(1.0f,6,5.0f));
                items.put("D", new Item(0.75f));
                return items;
            }
        });
        System.out.println("sum.sum(\"ABCDAAAC\") = " + sum.sum("ABCDAAAC"));
    }
}
