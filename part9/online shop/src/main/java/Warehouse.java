
import java.util.*;

public class Warehouse {

    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String name, int price, int stock) {
        productPrice.put(name, price);
        productStock.put(name, stock);
    }

    public int price(String product) {
        if (productPrice.containsKey(product)) {
            return productPrice.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (productStock.containsKey(product)) {
            return productStock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {

        if (productStock.containsKey(product)) {
            int stock = productStock.get(product);
            if (stock > 0) {
                stock = stock - 1;
                productStock.put(product, stock);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Set<String> products() {
        Set<String> setOfProducts = new HashSet<>();
        for (String x : productPrice.keySet()) {
            setOfProducts.add(x);
        }
        return setOfProducts;
    }
    

}
