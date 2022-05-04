package goitpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Summarizer {
    ShopItems shopItems = new ShopItems();

    public float sum(String input) {

        String[] listOfNameOfItems = input.split("");
        for (String l : listOfNameOfItems) {
            if (!shopItems.getItems().containsKey(l))
                throw new IllegalArgumentException("Incorrect list of item");
        }
        Map<String, Long> nameAndQty = Arrays.stream(listOfNameOfItems)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        float sum = 0;
        for (String key : nameAndQty.keySet()) {

            if (!isHappyQty(key)) {
                sum = sum + nameAndQty.get(key).intValue() * shopItems.getItems().get(key).getPrice();
            } else {
                sum = sum + priceForHappyQty(key, nameAndQty.get(key).intValue());
            }
        }
        System.out.println(sum);
        return sum;
    }

    private boolean isHappyQty(String name) {
        return shopItems.getItems().get(name).getHappyQty() > 0;
    }

    private float priceForHappyQty(String name, int qtyInBill) {
        int happyQty = shopItems.getItems().get(name).getHappyQty();
        float happyPrice = shopItems.getItems().get(name).getHappyPrice();
        float regularPrice = shopItems.getItems().get(name).getPrice();
        float sum;
        int fullTimesOfHappyQty = qtyInBill / happyQty;
        if (fullTimesOfHappyQty < 1) {
            sum = qtyInBill * regularPrice;
        } else {
            sum = fullTimesOfHappyQty * happyPrice + (qtyInBill - fullTimesOfHappyQty * happyQty) * regularPrice;
        }
        return sum;

    }

}



