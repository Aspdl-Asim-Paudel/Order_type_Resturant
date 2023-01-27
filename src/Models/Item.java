package Models;

public class Item extends Category {
    private String itemName;
    private double price;

    public Item(String mainCategoryName, String categoryName, String itemName, double price) {
        super(mainCategoryName, categoryName);
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

