
import java.util.*;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int mw) {
        this.items = new ArrayList<>();
        this.maxWeight = mw;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        int sumWeight = 0;
        for (Item x : this.items) {
            sumWeight += x.getWeight();
        }
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + sumWeight + " kg)";
        } else {
            return this.items.size() + " items (" + sumWeight + " kg)";
        }
    }

    public void printItems() {
        for (Item x : this.items) {
            System.out.println(x.toString() + "\n");
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item x : this.items) {
            total += x.getWeight();
        }
        return total;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heavy = this.items.get(0);
        for (Item x : this.items) {
            if (heavy.getWeight() < x.getWeight()) {
                heavy = x;
            }
        }
        return heavy;
    }

}
