
import java.util.*;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double helper = this.history.get(0);
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            for (Double x : this.history) {
                if (x > helper) {
                    helper = x;
                }
            }
        }
        return helper;
    }

    public double minValue() {
        double helper = this.history.get(0);
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            for (Double x : this.history) {
                if (x < helper) {
                    helper = x;
                }
            }
        }
        return helper;
    }

    public double average() {
        double sum = 0;
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            for (Double x : this.history) {
                sum = sum + x;
            }
        }
        return sum / this.history.size();
    }

    public String toString() {
        return this.history.toString();
    }
}
