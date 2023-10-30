
public class Fitbyte {

    private int age;
    private int restingheartRate;

    public Fitbyte(int age, int r) {
        this.age = age;
        this.restingheartRate = r;
    }

    public double maximum() {
        return 206.3 - (0.711 * this.age);
    }

    public double targetHeartRate(double percentage) {
        return ((this.maximum() - this.restingheartRate) * (percentage) + this.restingheartRate);
    }

}
