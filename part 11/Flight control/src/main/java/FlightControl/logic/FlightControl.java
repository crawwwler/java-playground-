package FlightControl.logic;

import java.util.*;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

public class FlightControl {

    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> place;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.place = new HashMap<>();
    }

    public void addAirplane(String id, int capacity) {
        Airplane plane = new Airplane(id, capacity);
        airplanes.put(id, plane);
    }

    public void addFlight(Airplane plane, String departure, String target) {
        this.place.putIfAbsent(departure, new Place(departure));
        this.place.putIfAbsent(target, new Place(target));
        Flight x = new Flight(plane, this.place.get(departure), this.place.get(target));
        this.flights.put(x.toString(), x);
    }

    public Collection<Airplane> getAirplane() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String id) {
        return this.airplanes.get(id);
    }
}
