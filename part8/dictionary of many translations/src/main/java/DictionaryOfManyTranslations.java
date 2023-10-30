
import java.util.*;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> hash;

    public DictionaryOfManyTranslations() {
        this.hash = new HashMap<>();
    }

    public void add(String key, String values) {
        this.hash.putIfAbsent(key, new ArrayList<>());
        ArrayList<String> helper = this.hash.get(key);
        helper.add(values);
    }

    public ArrayList<String> translate(String key) {
        if (this.hash.containsKey(key)) {
            if (this.hash.get(key).isEmpty()) {
                return new ArrayList<>();
            } else {
                return this.hash.get(key);
            }
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String key) {
        this.hash.remove(key);
    }
}
