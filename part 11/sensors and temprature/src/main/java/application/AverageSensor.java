package application;

import java.util.*;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> raw;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.raw = new ArrayList<>();
    }

    public boolean isOn() {
        boolean x = true;
        for (Sensor s : this.sensors) {
            if (s.isOn() == false) {
                x = false;
            }
        }
        return x;
    }

    public void setOn() {
        this.sensors.stream()
                .forEach(x -> x.setOn());
    }

    public void setOff() {
        this.sensors.get(0).setOff();
    }

    public int read() {
        if (isOn() == false || this.sensors.isEmpty()) {
            throw new IllegalStateException("is off/ is empty");
        }
        double x = this.sensors.stream()
                .mapToInt(i -> i.read())
                .average().getAsDouble();
        int c = (int) x;

        raw.add(c);
        return c;
    }

    public void addSensor(Sensor toadd) {
        this.sensors.add(toadd);
    }

    public List<Integer> readings() {
        return this.raw;
    }
}
