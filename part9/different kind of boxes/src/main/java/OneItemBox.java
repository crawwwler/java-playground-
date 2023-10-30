
import java.util.*;

public class OneItemBox extends Box {

    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if (this.items.size() == 0) {
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
