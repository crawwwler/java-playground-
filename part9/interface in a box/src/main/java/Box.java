
import java.util.*;

public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> list;

    public Box(double w) {
        this.maxWeight = w;
        this.list = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        for (Packable x : list) {
            weight = weight + x.weight();
        }
        return weight;
    }

    public void add(Packable item) {
        if (item.weight() + weight() > this.maxWeight) {
            return;
        } else {
            this.list.add(item);
        }
    }

    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + weight() + " kg";
    }
}
