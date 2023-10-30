
import java.util.*;

public class ShoppingCart {

    private Map<String, Item> sc;

    public ShoppingCart() {
        this.sc = new HashMap<>();
    }

    public void add(String product, int price) {
        if (sc.containsKey(product)) {
            sc.get(product).increaseQuantity();
        } else {
            Item x = new Item(product, price);
            sc.put(product, x);
        }
    }

    public int price() {
        int sum = 0;
        for (Item x : sc.values()) {
            sum = sum + x.price();
        }
        return sum;
    }

    public void print() {
        for (Item x : sc.values()) {
            System.out.println(x);
        }
    }
}
