
import java.util.*;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> hash;

    public StorageFacility() {
        this.hash = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.hash.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> helper = this.hash.get(unit);
        helper.add(item);
    }

    public ArrayList<String> contents(String unit) {
        if (this.hash.containsKey(unit)) {
            if (this.hash.get(unit).isEmpty()) {
                return new ArrayList<>();
            } else {
                return this.hash.get(unit);
            }
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String unit, String item) {
        ArrayList<String> helper = this.hash.get(unit);
        for (String s : helper) {
            if (s.equals(item)) {
                helper.remove(item);
                break;
            }
        }

        if (helper.isEmpty()) {
            this.hash.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> helper = new ArrayList<>();
        for (String x : this.hash.keySet()) {
            helper.add(x);
        }
        return helper;
    }
}
