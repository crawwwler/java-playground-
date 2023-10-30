
import java.util.ArrayList;

public class Hideout<T> {

    private T value;

    public Hideout() {
        this.value = null;
    }

    public void putIntoHideout(T toHide) {
        this.value = toHide;
    }

    public T takeFromHideout() {
        T x = this.value;
        this.value = null;
        return x;
    }

    public boolean isInHideout() {
        return this.value != null;
    }
}
