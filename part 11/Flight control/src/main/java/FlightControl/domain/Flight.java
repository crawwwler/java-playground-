package FlightControl.domain;

public class Flight {

    private Airplane airplane;
    private Place departure;
    private Place target;

    public Flight(Airplane a, Place d, Place t) {
        this.airplane = a;
        this.departure = d;
        this.target = t;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    
    @Override
    public String toString() {
        return this.airplane + " (" + this.departure + "-" + this.target + ")";
    }
}
