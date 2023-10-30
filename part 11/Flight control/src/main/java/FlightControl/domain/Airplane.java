package FlightControl.domain;

public class Airplane {

    private String id;
    private int capacity;

    public Airplane(String id, int cap) {
        this.id = id;
        this.capacity = cap;
    }

    public String getID() {
        return this.id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    
    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " capacity)";
    }
}
