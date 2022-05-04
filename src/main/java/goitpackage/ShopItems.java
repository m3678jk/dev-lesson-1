package goitpackage;

import lombok.Data;
import java.util.HashMap;
import java.util.Map;

@Data
public class ShopItems {
    private final Map <String,Item> items = new HashMap();

    public void addItem(String name, Item item){
        items.put(name, item);
    }

    {
        addItem("A", new Item(1.25f,3,3.0f));
        addItem("B", new Item(4.25f));
        addItem("C", new Item(1.0f,6,5.0f));
        addItem("D", new Item(0.75f));
    }

}
