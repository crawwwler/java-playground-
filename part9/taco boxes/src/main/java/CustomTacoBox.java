
public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int n) {
        this.tacos = n;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (this.tacos > 0) {
            this.tacos -= 1;
        } else {
            return;
        }
    }
}
