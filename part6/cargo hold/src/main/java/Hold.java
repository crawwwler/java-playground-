
import java.util.*;

public class Hold {

    private ArrayList<Suitcase> suits;
    private int mxw;

    public Hold(int mx) {
        this.mxw = mx;
        this.suits = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int suitWeight = 0;
        for (Suitcase x : this.suits) {
            suitWeight += x.totalWeight();
        }

        if (suitWeight + suitcase.totalWeight() <= this.mxw) {
            this.suits.add(suitcase);
        }
    }

    public String toString() {
        int sum = 0;
        for (Suitcase x : this.suits) {
            sum += x.totalWeight();
        }
        if (this.suits.isEmpty()) {
            return "no suitcase (0 kg)";
        } else if (this.suits.size() == 1) {
            return "1 suitcase (" + sum + " kg)";
        } else {
            return this.suits.size() + " suitcases (" + sum + " kg)";
        }
    }

    public void printItems() {
        for (Suitcase x : this.suits) {
            x.printItems();
        }
    }
}
