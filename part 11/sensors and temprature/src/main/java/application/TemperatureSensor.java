package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean o;

    public TemperatureSensor() {
        this.o = false;
    }

    @Override
    public boolean isOn() {
        return o;
    }

    @Override
    public void setOn() {
        this.o = true;
    }

    @Override
    public void setOff() {
        this.o = false;
    }

    @Override
    public int read() {

        if (isOn() == true) {
            Random r = new Random();
            int x = r.nextInt(61);
            if (x <= 30) {
                return x * -1;
            } else {
                return x - 30;
            }
        } else {
            throw new IllegalStateException("is off");
        }
    }
}
