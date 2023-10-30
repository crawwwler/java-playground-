
public class Counter {

    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int i) {
        if (i < 0) {
            this.value = this.value;
        } else {
            this.value = this.value + i;
        }
    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int i) {
        if (i < 0) {
            this.value = this.value;
        } else {
            this.value = this.value - i;
        }
    }

}
