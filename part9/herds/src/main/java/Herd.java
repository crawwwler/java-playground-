
import java.util.*;

public class Herd implements Movable {
    
    private List<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }
    
    public void move(int dx, int dy) {
        for (Movable x : this.list) {
            x.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable m) {
        this.list.add(m);
    }
    
    public String toString() {
        String helper = "";
        for (Movable x : this.list) {
            helper = helper + x + "\n";
        }
        return helper;
    }
}
