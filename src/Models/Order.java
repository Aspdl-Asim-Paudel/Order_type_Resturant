package Models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> item;
    private double totalPrice;

    public Order() {
        item = new ArrayList<>();
    }

    public void addItem(Item item) {
        item.add(item);
        totalPrice += item.getPrice();
    }

    public List<Item> getItem() {
        return item;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

