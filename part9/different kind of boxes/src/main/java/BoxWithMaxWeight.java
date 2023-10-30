
import java.util.*;

public class BoxWithMaxWeight extends Box {

    private int maximum;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int max) {
        this.maximum = max;
        this.items = new ArrayList<>();
    }

    public int weightOfBox() {
        int sum = 0;
        for (Item x : this.items) {
            sum = sum + x.getWeight();
        }
        return sum;
    }

    public void add(Item item) {
        if (item.getWeight() + weightOfBox() <= maximum) {
            this.items.add(item);
        } else {
            return;
        }
    }

    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}
