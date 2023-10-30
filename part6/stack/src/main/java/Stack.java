
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> ss;

    public Stack() {
        this.ss = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.ss.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        this.ss.add(value);
    }

    public ArrayList<String> values() {

        ArrayList<String> stackList = new ArrayList<>();
        for (int i = this.ss.size() - 1; i >= 0; i--) {
            stackList.add(this.ss.get(i));
        }
        return stackList;
    }

    public String take() {

        String x = this.values().get(0);
        this.ss.remove(this.ss.size() - 1);
        return x;
    }

}
