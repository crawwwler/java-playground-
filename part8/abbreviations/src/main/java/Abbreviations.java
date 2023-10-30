
import java.util.*;

public class Abbreviations {

    private HashMap<String, String> abs;

    public Abbreviations() {
        this.abs = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (this.hasAbbreviation(abbreviation)) {
            return;
        }
        abs.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abb) {
        if (abs.containsKey(abb)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abb) {
        if (this.hasAbbreviation(abb)) {
            return abs.get(abb);
        }
        return null;
    }
}
