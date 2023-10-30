
import java.util.*;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        for (String x : list) {
            System.out.println((list.indexOf(x) + 1) + ": " + x);
        }
    }

    public void remove(int index) {
        this.list.remove(index - 1);
    }

}
