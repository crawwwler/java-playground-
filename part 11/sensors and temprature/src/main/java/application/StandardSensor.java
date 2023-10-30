package application;

public class StandardSensor implements Sensor {

    private int value;

    public StandardSensor(int v) {
        this.value = v;
    }

    @Override
    public int read() {
        return this.value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }
}
