import Models.Category;
import Models.Item;
import Models.MainCategory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // create a customer
        Customer customer = new Customer("John Doe", "johndoe@email.com");

        // create an order
        Order order = new Order();

        // add items to the order
        MainCategory mainCategory = new MainCategory("Food");
        Category category = new Category("Main Course", mainCategory);
        Item item1 = new Item("Spaghetti", category, 12.99);
        Item item2 = new Item("Pizza", category, 15.99);
        order.addItem(item1);
        order.addItem(item2);

        // set the order for the customer
        customer.setOrder(order);

        // print the invoice for the customer
        printInvoice(customer);
    }

    public static void printInvoice(Customer customer) {
        System.out.println("Invoice for " + customer.getName());
        System.out.println("Email: " + customer.getEmail());

        ArrayList<Items> items = customer.getOrder().getItems();
        double total = 0;
        for (Items item : items) {
            System.out.println("- " + item.getName() + " (" + item.getCategory().getName() + " - " + item.getCategory().getMainCategory().getName() + ") $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}
