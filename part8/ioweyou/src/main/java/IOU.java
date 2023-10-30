
import java.util.*;

public class IOU {

    private HashMap<String, Double> hash;

    public IOU() {
        this.hash = new HashMap<>();
    }

    public void setSum(String towhom, double amount) {
        double pre = this.howMuchDoIOweTo(towhom);
        pre = amount;
        hash.put(towhom, pre);
    }

    public double howMuchDoIOweTo(String towhom) {
        return hash.getOrDefault(towhom, 0.00);
    }

}
